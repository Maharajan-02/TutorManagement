package com.tutormanager.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String email;
	String phone;
	String className;
	String guardianPhone;
	LocalDate joinedDate;

	@ManyToOne
	Tutor tutor;

	@OneToMany(mappedBy = "student")
	List<FeeRecord> feeRecords;

	@OneToMany(mappedBy = "student")
	List<Reminder> reminders;


}
