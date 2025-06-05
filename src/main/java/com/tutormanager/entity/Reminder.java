package com.tutormanager.entity;

import java.time.LocalDateTime;

import com.tutormanager.enums.ReminderStatus;
import com.tutormanager.enums.ReminderType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Reminder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	ReminderType type; // EMAIL / WHATSAPP
	ReminderStatus status; // PENDING / SENT / FAILED
	LocalDateTime sentDate;
	String message;

	@ManyToOne
	Student student;

	
}
