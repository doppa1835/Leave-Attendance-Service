package com.erp.leaveattendance.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the leave_balance database table.
 * 
 */
@Entity
@Table(name="leave_balance")
@NamedQuery(name="LeaveBalance.findAll", query="SELECT l FROM LeaveBalance l")
public class LeaveBalance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private Long employee;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="remaining_leaves")
	private double remainingLeaves;

	@Column(name="updated_on")
	private Long updatedOn;

	//bi-directional many-to-one association to LeaveType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="leave_type")
	private LeaveType leaveTypeBean;

	public LeaveBalance() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployee() {
		return this.employee;
	}

	public void setEmployee(Long employee) {
		this.employee = employee;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public double getRemainingLeaves() {
		return this.remainingLeaves;
	}

	public void setRemainingLeaves(double remainingLeaves) {
		this.remainingLeaves = remainingLeaves;
	}

	public Long getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Long updatedOn) {
		this.updatedOn = updatedOn;
	}

	public LeaveType getLeaveTypeBean() {
		return this.leaveTypeBean;
	}

	public void setLeaveTypeBean(LeaveType leaveTypeBean) {
		this.leaveTypeBean = leaveTypeBean;
	}

}