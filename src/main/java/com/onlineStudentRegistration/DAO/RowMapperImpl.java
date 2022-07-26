package com.onlineStudentRegistration.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.onlineStudentRegistration.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setfName(rs.getString("fName"));
		s.setlName(rs.getString("lName"));
		s.setEmail(rs.getString("email"));
		s.setPassword(rs.getString("password"));
		return s;
	}

}
