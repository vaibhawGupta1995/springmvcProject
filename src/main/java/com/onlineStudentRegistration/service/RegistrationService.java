package com.onlineStudentRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.onlineStudentRegistration.DAO.RegistrationRepository;
import com.onlineStudentRegistration.entity.Student;
@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository; 
	
	public void getDataForService(Student student) {
		
		registrationRepository.saveDatatoDatabase(student);
		
	}
	public List<Student> sendDataForLoginVerification(){
		System.out.println("I am in service layer");
		List<Student> allStudent = this.registrationRepository.getAllData();
		
		
		
		return allStudent;
	}
	public void updatePassword(String pswd1, String newEmail) {
		this.registrationRepository.updatePasswordInTable(pswd1,newEmail);
		
	}
	
}
