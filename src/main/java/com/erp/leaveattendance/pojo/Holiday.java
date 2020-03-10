package com.erp.leaveattendance.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the holidays database table.
 * 
 */
@Entity
@Table(name="holidays")
@NamedQuery(name="Holiday.findAll", query="SELECT h FROM Holiday h")
public class Holiday implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="holiday_on")
	private Long holidayOn;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="is_week_day")
	private byte isWeekDay;

	private String reason;

	public Holiday() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getHolidayOn() {
		return this.holidayOn;
	}

	public void setHolidayOn(Long holidayOn) {
		this.holidayOn = holidayOn;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public byte getIsWeekDay() {
		return this.isWeekDay;
	}

	public void setIsWeekDay(byte isWeekDay) {
		this.isWeekDay = isWeekDay;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}