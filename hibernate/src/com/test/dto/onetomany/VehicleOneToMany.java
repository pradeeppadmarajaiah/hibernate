
package com.test.dto.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE_ONE_TO_MANY")
public class VehicleOneToMany {

	@Id
	@GeneratedValue
	@Column(name = "VEHICLE_ID")
	private int vehicleId;

	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	/**
	 * @return the vehicleId
	 */
	public final int getVehicleId() {
		return vehicleId;
	}

	/**
	 * @param vehicleId
	 *            the vehicleId to set
	 */
	public final void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * @return the vehicleName
	 */
	public final String getVehicleName() {
		return vehicleName;
	}

	/**
	 * @param string
	 *            the vehicleName to set
	 */
	public final void setVehicleName(String string) {
		this.vehicleName = string;
	}

}
