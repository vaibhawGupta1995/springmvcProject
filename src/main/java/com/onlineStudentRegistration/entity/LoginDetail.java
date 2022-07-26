package com.onlineStudentRegistration.entity;

public class LoginDetail {
	private String loginEmail;
	private String loginPassword;
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public LoginDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginDetail(String loginEmail, String loginPassword) {
		super();
		this.loginEmail = loginEmail;
		this.loginPassword = loginPassword;
	}
	@Override
	public String toString() {
		return "LoginDetail [loginEmail=" + loginEmail + ", loginPassword=" + loginPassword + "]";
	}
	
	

}
