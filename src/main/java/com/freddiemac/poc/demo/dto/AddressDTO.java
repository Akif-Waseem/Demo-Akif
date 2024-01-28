package com.freddiemac.poc.demo.dto;

public class AddressDTO {
	
	// DTO class for AddressDomain class.
	
	private int addressId;
	private String streetAddress;
//	private int orgId;
	//private OrgDTO orgDTO;
	
	
	// generate getters and setters.
	
	public int getAddressId() {
		return addressId;
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
	
	
	
	

}
