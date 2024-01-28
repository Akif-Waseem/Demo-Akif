package com.freddiemac.poc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freddiemac.poc.demo.dto.Loan;
import com.freddiemac.poc.demo.service.LoanService;

@RestController
public class LoanController {

	@Autowired
	LoanService loanService;
	
	// call loan service to save loan details.
	@PostMapping("/saveLoan")
	public Loan saveLoan(Loan loan) {
		return loanService.saveLoan(loan);
	}
	
	// get loan details by loan id.
	@GetMapping("/getLoan/{loanId}")
	public Loan getLoan(Integer loanId) {
		return loanService.getLoan(loanId);
	}
	// get all loans from loan service.
	@GetMapping("/getLoans")
	public List<Loan> getLoans() {
		return loanService.getLoans();
	}
	// delete loan details by loan id.
	@GetMapping("/deleteLoan/{loanId}")
	public Loan deleteLoan(Integer loanId) {
		return loanService.deleteLoan(loanId);
	}
	

	
	
	
	
	
	
}
