package com.onlineStudentRegistration.entity;

public class NewPassword {
	private String newPswd;
	private String cnfmNewPswd;
	private String newEmail;
	
	
	public String getNewPswd() {
		return newPswd;
	}
	public void setNewPswd(String newPswd) {
		this.newPswd = newPswd;
	}
	public String getCnfmNewPswd() {
		return cnfmNewPswd;
	}
	public void setCnfmNewPswd(String cnfmNewPswd) {
		this.cnfmNewPswd = cnfmNewPswd;
	}
	public NewPassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNewEmail() {
		return newEmail;
	}
	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}
	public NewPassword(String newPswd, String cnfmNewPswd, String newEmail) {
		super();
		this.newPswd = newPswd;
		this.cnfmNewPswd = cnfmNewPswd;
		this.newEmail = newEmail;
	}
	@Override
	public String toString() {
		return "NewPassword [newPswd=" + newPswd + ", cnfmNewPswd=" + cnfmNewPswd + ", newEmail=" + newEmail + "]";
	}
	

}
