package com.spring.bank.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Loans")
public class Loans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loan_id")
	private int loanId;
	@Column(name = "loan_name")
	private String loanName;
	@Column(name = "loan_interest")
	private BigDecimal loanInterest;

}
