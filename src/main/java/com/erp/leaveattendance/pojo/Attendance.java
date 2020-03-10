package com.erp.leaveattendance.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the attendance database table.
 * 
 */
@Entity
@NamedQuery(name="Attendance.findAll", query="SELECT a FROM Attendance a")
public class Attendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="created_on")
	private Long createdOn;

	@Column(name="is_informed")
	private byte isInformed;

	@Column(name="is_mail_sent_to_parents")
	private byte isMailSentToParents;

	@Column(name="is_present")
	private byte isPresent;

	private String reason;

	private BigInteger student;

	@Column(name="subject_time_table")
	private Long subjectTimeTable;

	public Attendance() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Long createdOn) {
		this.createdOn = createdOn;
	}

	public byte getIsInformed() {
		return this.isInformed;
	}

	public void setIsInformed(byte isInformed) {
		this.isInformed = isInformed;
	}

	public byte getIsMailSentToParents() {
		return this.isMailSentToParents;
	}

	public void setIsMailSentToParents(byte isMailSentToParents) {
		this.isMailSentToParents = isMailSentToParents;
	}

	public byte getIsPresent() {
		return this.isPresent;
	}

	public void setIsPresent(byte isPresent) {
		this.isPresent = isPresent;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public BigInteger getStudent() {
		return this.student;
	}

	public void setStudent(BigInteger student) {
		this.student = student;
	}

	public Long getSubjectTimeTable() {
		return this.subjectTimeTable;
	}

	public void setSubjectTimeTable(Long subjectTimeTable) {
		this.subjectTimeTable = subjectTimeTable;
	}

}