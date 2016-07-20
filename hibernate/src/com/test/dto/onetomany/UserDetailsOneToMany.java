package com.test.dto.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ONE_TO_MANY")
public class UserDetailsOneToMany {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@OneToMany()
	@JoinTable(name = "USER_VEHICLE", joinColumns = @JoinColumn(name = "USER_ID") , inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID") )
	private Collection<VehicleOneToMany> vehicle = new ArrayList<>();

	/**
	 * @return the vehicle
	 */
	public final Collection<VehicleOneToMany> getVehicle() {
		return vehicle;
	}

	/**
	 * @param vehicle
	 *            the vehicle to set
	 */
	public final void setVehicle(Collection<VehicleOneToMany> vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @return the userId
	 */
	public final int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public final void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public final String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public final void setUserName(String userName) {
		this.userName = userName;
	}

}
