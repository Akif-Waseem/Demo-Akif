package com.freddiemac.poc.demo.dto;

import java.util.List;

public class OrgDTO {
	
	// generate getter setter like OrgDoamin class.
	
	
	private int orgId;
	private String orgName;
	private List<AddressDTO> orgAddress;
	private List<AccountDTO> orgAccount;
	
	
	// generate getters and setters.
	public int getOrgId() {
		return orgId;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	

	public List<AddressDTO> getOrgAddress() {
		return orgAddress;
	}
	
	public void setOrgAddress(List<AddressDTO> orgAddress) {
		this.orgAddress = orgAddress;
	}
	
	public List<AccountDTO> getOrgAccount() {
		return orgAccount;
	}
	
	public void setOrgAccount(List<AccountDTO> orgAccount) {
		this.orgAccount = orgAccount;
	}
	

}
