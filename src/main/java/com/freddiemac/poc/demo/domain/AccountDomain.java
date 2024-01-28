package com.freddiemac.poc.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ACCOUNT")
public class AccountDomain {

	@Id
	@Column(name = "ACCOUNT_ID")
	private int accountId;
	@Column(name = "ACCOUNT_NAME")
	private String accountName;
	@Column(name = "ORG_ID")
	private int orgId;
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "ORG_ID", nullable = false, insertable = false, updatable = false)
	private OrgDomain orgDomain;
	
	// generate getters and setters for all fields.
	public int getAccountId() {
		return accountId;
	}
	
	public OrgDomain getOrgDomain() {
  		return orgDomain;
	}
	
	
	public void setOrgDomain(OrgDomain orgDomain) {
		this.orgDomain = orgDomain;
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

	public int getOrgId() {
		return orgId;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
	
	

	
	
	
	
}


