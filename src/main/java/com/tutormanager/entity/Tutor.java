package com.tutormanager.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.tutormanager.enums.PlanType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Tutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String email;
	String phone;
	String password;
	LocalDate trialStartDate;
	Boolean trialExpired;
	@Enumerated(EnumType.STRING) PlanType planType; // e.g., FREE_TRIAL, PAID
	LocalDateTime createdAt;

	@OneToMany(mappedBy = "tutor")
	List<Student> students;

	@OneToMany(mappedBy = "tutor")
	List<TutorBilling> billings;

}
