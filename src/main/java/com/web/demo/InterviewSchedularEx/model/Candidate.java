package com.web.demo.InterviewSchedularEx.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "candidate")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	@Column(name = "emailId", unique = true, nullable = false)
	private String email;
	private String mobile;
	private Integer ctc;
	private Integer ectc;
	private String location;
	private String notice;
	private String remarkss;

}