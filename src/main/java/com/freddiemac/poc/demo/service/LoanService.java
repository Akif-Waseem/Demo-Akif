package com.freddiemac.poc.demo.service;

import java.util.List;

import com.freddiemac.poc.demo.dto.Loan;

public interface LoanService {
	
	
	
	
	
	List<Loan> getLoans();
	Loan getLoan(Integer loanId);
	Loan saveLoan(Loan loan);
	Loan deleteLoan(Integer loanId);

}
