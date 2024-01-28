package com.freddiemac.poc.demo.dto;

// craete Loan class with loanId, loanName, loanAmount, loanType
public class Loan {

	private int loanId;
	private String loanName;
	private double loanAmount;
	private String loanType;
	
	// generate constructor.
	public Loan() {
		super();
	}
	
	// generate constructor with fields.
	public Loan(int loanId, String loanName, double loanAmount, String loanType) {
		super();
		this.loanId = loanId;
		this.loanName = loanName;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
	}

	// generate getters and setters.
	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

}