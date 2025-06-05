package com.tutormanager.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FeeRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	YearMonth month;
	BigDecimal amount;
	Boolean paid;
	LocalDate dueDate;
	LocalDate paymentDate;
	String razorpayPaymentId; // 💸 track Razorpay transaction

	@ManyToOne
	Student student;


}
