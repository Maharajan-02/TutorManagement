package com.tutormanager.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.YearMonth;

import com.tutormanager.enums.BillingStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class TutorBilling {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	YearMonth billingMonth;
	BigDecimal baseFee;
	Integer studentCount;
	BigDecimal totalAmount;
	BillingStatus status; // PENDING / PAID
	LocalDateTime generatedAt;
	LocalDateTime paidAt;
	String razorpayPaymentId;

	@ManyToOne
	Tutor tutor;

	
}
