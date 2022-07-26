package com.onlineStudentRegistration.entity;

public class Student {
	private String fName;
	private String lName;
	private String email;
	private String password;
	private String cnfmPassword;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCnfmPassword() {
		return cnfmPassword;
	}
	public void setCnfmPassword(String cnfmPassword) {
		this.cnfmPassword = cnfmPassword;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fName, String lName, String email, String password, String cnfmPassword) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.cnfmPassword = cnfmPassword;
	}
	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", email=" + email + ", password=" + password
				+ ", cnfmPassword=" + cnfmPassword + "]";
	}
	
	
	

}
