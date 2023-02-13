package com.web.demo.InterviewSchedularEx.model;

import java.time.LocalDateTime;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.web.demo.InterviewSchedularEx.Enum.InterviewStatus;
import com.web.demo.InterviewSchedularEx.Enum.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Inteview")
public class Interview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(optional = false)
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	@OneToOne(optional = false)
	@JoinColumn(name = "schedular_id")
	private User schedular;
	@OneToOne(optional = false)
	@JoinColumn(name = "interviewer_id")
	private User interviewer;
	private LocalDateTime dateTime; 
	@OneToOne(optional = false)
	@JoinColumn(name = "talent_id")
	private Talent talent;
	@Enumerated(EnumType.STRING)
	private InterviewStatus interviewStatus;
	private String meetlink;
}
