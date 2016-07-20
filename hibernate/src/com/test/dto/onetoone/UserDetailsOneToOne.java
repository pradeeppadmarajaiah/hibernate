package com.test.dto.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ONE_TO_ONE")
public class UserDetailsOneToOne {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@OneToOne
	@JoinColumn(name = "VEHICLE_ID")
	private VehicleOneToOne vehicleOneToOne;

	/**
	 * @return the vehicleOneToOne
	 */
	public final VehicleOneToOne getVehicleOneToOne() {
		return vehicleOneToOne;
	}

	/**
	 * @param vehicleOneToOne
	 *            the vehicleOneToOne to set
	 */
	public final void setVehicleOneToOne(VehicleOneToOne vehicleOneToOne) {
		this.vehicleOneToOne = vehicleOneToOne;
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
