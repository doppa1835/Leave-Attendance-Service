package com.erp.leaveattendance.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the leave_history database table.
 * 
 */
@Entity
@Table(name="leave_history")
@NamedQuery(name="LeaveHistory.findAll", query="SELECT l FROM LeaveHistory l")
public class LeaveHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="applied_on")
	private Long appliedOn;

	@Column(name="approved_on")
	private Long approvedOn;

	private Long employee;

	@Column(name="from_date")
	private Long fromDate;

	@Column(name="number_of_days")
	private double numberOfDays;

	private String reason;

	private String status;

	@Column(name="task_assigned_to")
	private Long taskAssignedTo;

	@Column(name="to_date")
	private Long toDate;

	//bi-directional many-to-one association to LeaveType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="leave_type")
	private LeaveType leaveTypeBean;

	public LeaveHistory() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAppliedOn() {
		return this.appliedOn;
	}

	public void setAppliedOn(Long appliedOn) {
		this.appliedOn = appliedOn;
	}

	public Long getApprovedOn() {
		return this.approvedOn;
	}

	public void setApprovedOn(Long approvedOn) {
		this.approvedOn = approvedOn;
	}

	public Long getEmployee() {
		return this.employee;
	}

	public void setEmployee(Long employee) {
		this.employee = employee;
	}

	public Long getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Long fromDate) {
		this.fromDate = fromDate;
	}

	public double getNumberOfDays() {
		return this.numberOfDays;
	}

	public void setNumberOfDays(double numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTaskAssignedTo() {
		return this.taskAssignedTo;
	}

	public void setTaskAssignedTo(Long taskAssignedTo) {
		this.taskAssignedTo = taskAssignedTo;
	}

	public Long getToDate() {
		return this.toDate;
	}

	public void setToDate(Long toDate) {
		this.toDate = toDate;
	}

	public LeaveType getLeaveTypeBean() {
		return this.leaveTypeBean;
	}

	public void setLeaveTypeBean(LeaveType leaveTypeBean) {
		this.leaveTypeBean = leaveTypeBean;
	}

}