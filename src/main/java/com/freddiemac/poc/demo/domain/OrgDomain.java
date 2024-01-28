package com.freddiemac.poc.demo.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "ORG")
public class OrgDomain {

	@Id
	@Column(name = "ORG_ID")
	private int orgId;
	@Column(name = "ORG_NAME")
	private String orgName;
	@OneToMany(mappedBy = "orgId")
	private List<AddressDomain> orgAddress;
	
	@OneToMany(mappedBy = "orgId")
	private List<AccountDomain> orgAccount;
	
	
	
	// generate getters and setters.
	public int getOrgId() {
		return orgId;
	}

	public List<AddressDomain> getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(List<AddressDomain> orgAddress) {
		this.orgAddress = orgAddress;
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
	
	public List<AccountDomain> getOrgAccount() {
		return orgAccount;
	}
	
	public void setOrgAccount(List<AccountDomain> orgAccount) {
		this.orgAccount = orgAccount;
	}
	
	@Override
	public String toString() {
		return "OrgDomain [orgId=" + orgId + ", orgName=" + orgName + "]";
	}
	
}
