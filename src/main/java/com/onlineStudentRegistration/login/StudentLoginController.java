package com.onlineStudentRegistration.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlineStudentRegistration.entity.LoginDetail;
import com.onlineStudentRegistration.entity.NewPassword;
import com.onlineStudentRegistration.entity.Student;
import com.onlineStudentRegistration.service.RegistrationService;

@Controller
public class StudentLoginController {
	@Autowired
	private RegistrationService registrationService;

	@RequestMapping("/login")
	public String login() {
		return "loginPage";
	}

	@RequestMapping("/successLogin")
	public String successLogin(@ModelAttribute LoginDetail loginDetail, Model model ) {
		String userEmail = loginDetail.getLoginEmail();
		System.out.println("USer Input email=" + userEmail);
		String userPassword = loginDetail.getLoginPassword();
		System.out.println("user input password=" + userPassword);

		List<Student> allStudent = this.registrationService.sendDataForLoginVerification();
		String name="";
		for (Student student : allStudent) {
			if (student.getEmail().toString().equals(userEmail)
					&& student.getPassword().toString().equals(userPassword)) {
				name=student.getfName();
				model.addAttribute("userName", name);
				return "successlogin";
			}
		}
		return "failedLogin";

	}
	
	@RequestMapping("/forget")
	public String forget() {
	
		return "forget";
	}
	
	@RequestMapping(path="/successForgotPassword",method = RequestMethod.POST)
	public String successForgot(@ModelAttribute NewPassword newPassword) {
		String pswd1=newPassword.getNewPswd();
		String pswd2=newPassword.getCnfmNewPswd();
		String newEmail=newPassword.getNewEmail();
		if(pswd1.equals(pswd2)) {
			this.registrationService.updatePassword(pswd1,newEmail);
			return "successForgot";
		}
		else {
			return "failedForget";
		}
	}
}
