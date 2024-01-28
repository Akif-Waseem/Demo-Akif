package com.freddiemac.poc.demo.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "ADDRESS")
public class AddressDomain {

	// generate getters and setters.
	@Id	
	@Column(name = "ADDR_ID")
	private int addressId;
	@Column(name = "street_address")
	private String streetAddress;
	@Column(name = "org_id")
	private int orgId;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "ORG_ID", nullable = false, insertable = false, updatable = false)
	private OrgDomain orgDomain;
	
	// generate getters and setters for all fields.	
	public int getAddressId() {
		return addressId;
	}	

	public OrgDomain getOrgDomain() {
		return orgDomain;
	}	
	
	public void setOrgDomain(OrgDomain orgDomain) {
		this.orgDomain = orgDomain;
	}
	
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
		
	public int getOrgId() {
		return orgId;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
	@Override	
	public String toString() {
		return "AddressDomain [addressId=" + addressId + ", streetAddress=" + streetAddress + ", orgId=" + orgId + "]";
	}
	
		
		
	
	
}
