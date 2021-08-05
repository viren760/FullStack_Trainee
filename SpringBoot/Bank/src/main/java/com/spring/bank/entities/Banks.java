package com.spring.bank.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Banks")
public class Banks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_id")
	private int bankId;
	@Column(name = "bank_name")
	private String bankName;

	@OneToMany(targetEntity = Loans.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "bank_loanfk", referencedColumnName = "bank_id")
	private List<Loans> loans;

}
