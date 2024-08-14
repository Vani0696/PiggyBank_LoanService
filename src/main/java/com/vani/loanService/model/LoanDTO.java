package com.vani.loanService.model;

import lombok.Data;

@Data
public class LoanDTO {

	private Long id;
	private String borrowerName;
	private Double loanAmount;
	private Double interestRate;
	private Integer loanTerm;
}