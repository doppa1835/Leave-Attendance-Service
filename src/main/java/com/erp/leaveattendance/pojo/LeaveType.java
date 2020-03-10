package com.erp.leaveattendance.pojo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the leave_type database table.
 * 
 */
@Entity
@Table(name="leave_type")
@NamedQuery(name="LeaveType.findAll", query="SELECT l FROM LeaveType l")
public class LeaveType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="leave_count")
	private double leaveCount;

	private String type;

	@Column(name="updated_on")
	private Long updatedOn;

	//bi-directional many-to-one association to LeaveBalance
	@OneToMany(mappedBy="leaveTypeBean")
	private List<LeaveBalance> leaveBalances;

	//bi-directional many-to-one association to LeaveHistory
	@OneToMany(mappedBy="leaveTypeBean")
	private List<LeaveHistory> leaveHistories;

	public LeaveType() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public double getLeaveCount() {
		return this.leaveCount;
	}

	public void setLeaveCount(double leaveCount) {
		this.leaveCount = leaveCount;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Long updatedOn) {
		this.updatedOn = updatedOn;
	}

	public List<LeaveBalance> getLeaveBalances() {
		return this.leaveBalances;
	}

	public void setLeaveBalances(List<LeaveBalance> leaveBalances) {
		this.leaveBalances = leaveBalances;
	}

	public LeaveBalance addLeaveBalance(LeaveBalance leaveBalance) {
		getLeaveBalances().add(leaveBalance);
		leaveBalance.setLeaveTypeBean(this);

		return leaveBalance;
	}

	public LeaveBalance removeLeaveBalance(LeaveBalance leaveBalance) {
		getLeaveBalances().remove(leaveBalance);
		leaveBalance.setLeaveTypeBean(null);

		return leaveBalance;
	}

	public List<LeaveHistory> getLeaveHistories() {
		return this.leaveHistories;
	}

	public void setLeaveHistories(List<LeaveHistory> leaveHistories) {
		this.leaveHistories = leaveHistories;
	}

	public LeaveHistory addLeaveHistory(LeaveHistory leaveHistory) {
		getLeaveHistories().add(leaveHistory);
		leaveHistory.setLeaveTypeBean(this);

		return leaveHistory;
	}

	public LeaveHistory removeLeaveHistory(LeaveHistory leaveHistory) {
		getLeaveHistories().remove(leaveHistory);
		leaveHistory.setLeaveTypeBean(null);

		return leaveHistory;
	}

}