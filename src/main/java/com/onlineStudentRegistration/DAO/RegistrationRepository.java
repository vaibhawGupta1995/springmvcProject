package com.onlineStudentRegistration.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.onlineStudentRegistration.entity.Student;
@Repository
public class RegistrationRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveDatatoDatabase(Student student) {
		
		String query="insert into student(fname,lname,email,password) values(?,?,?,?)";
		int res = this.jdbcTemplate.update(query,student.getfName(),student.getlName(),student.getEmail(),student.getPassword());
		System.out.println("Data inserted successfully "+res);
	} 
	
	public List<Student> getAllData(){
		String query="select * from student";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		List<Student> allStudent=this.jdbcTemplate.query(query, rowMapper);
//		
//		for(Student s:allStudent) {
//			//System.out.println(s);
//		}
		
		return allStudent;
	}

	public void updatePasswordInTable(String pswd1,String newEmail) {
		String query="update student set password=? where email=?";
		
		this.jdbcTemplate.update(query, pswd1,newEmail);
		
	}

	
	
}
