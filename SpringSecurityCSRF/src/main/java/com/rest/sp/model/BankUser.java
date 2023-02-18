package com.rest.sp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BankUser {
	@Id
	@GeneratedValue
	private Integer bankId;
	
	private Integer bankAcc;
	
	private double bankAmt;
	
	
}
