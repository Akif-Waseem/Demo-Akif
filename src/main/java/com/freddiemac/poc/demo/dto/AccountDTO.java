package com.freddiemac.poc.demo.dto;

public class AccountDTO {
	
	// generate fields phoneNumber, emailId, accountId, accountName.
	private String phoneNumber;
	private String emailId;
	
	private int accountId;
	private String accountName;

	
	// generate getters and setters.
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// validate emailId and phoneNumber.
	public boolean validateEmailId(String emailId) {
		if (emailId.contains("@") && emailId.contains(".com")) {
			return true;
		}
		return false;
	}
	
	public boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber.length() == 10) {
			return true;
		}
		return false;
	}
	

}
