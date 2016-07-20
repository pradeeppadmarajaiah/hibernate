package com.test.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "STREET_NAME")
	private String street;
	private String city;
	private String state;
	private String zipcode;

	/**
	 * @return the street
	 */
	public final String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public final void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public final String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode
	 *            the zipcode to set
	 */
	public final void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
