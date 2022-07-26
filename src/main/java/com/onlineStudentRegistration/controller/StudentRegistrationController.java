package com.onlineStudentRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlineStudentRegistration.entity.Student;
import com.onlineStudentRegistration.service.RegistrationService;

@Controller
public class StudentRegistrationController {
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping("/registration")
	public String register() {
		return "registration";
	}
	
	@RequestMapping(path = "/successRegister",method = RequestMethod.POST)
	public String successRegister(@ModelAttribute Student student) {
		
		String password=student.getPassword();
		String cnfmPassword=student.getCnfmPassword();
		if(password.equals(cnfmPassword)) {
			this.registrationService.getDataForService(student);
			return "successRegister";
		}
		
		else {
			return "failedRegistration";
		}
		
		
		
		
	}

}
