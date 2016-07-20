package com.test.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "EMPLOYEE_ID")
	private String employeeId;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;

	@OneToMany
	private Collection<Vehicle> vehicle = new ArrayList<>();

	/**
	 * @return the vehicle
	 */
	public final Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public final void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @return the employeeId
	 */
	public final String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public final void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public final String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public final void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
