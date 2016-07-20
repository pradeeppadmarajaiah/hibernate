package com.test.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER")
public class UserDetails {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "JOINING_DATE")
	@Temporal(TemporalType.DATE)
	private Date joiningDate;

	@Transient
	private String gender;

	@Column(name = "DESCRIPTION")
	@Lob
	private String description;

	@Embedded
	private Address homeAddress;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "O_STREET") ),
			@AttributeOverride(name = "city", column = @Column(name = "O_CITY") ),
			@AttributeOverride(name = "state", column = @Column(name = "O_STATE") ),
			@AttributeOverride(name = "zipcode", column = @Column(name = "O_ZIP_CODE") )

	})
	private Address officeAddress;

	// Using Collections
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@ElementCollection
	@JoinTable(name = "USER_ORDER", joinColumns = @JoinColumn(name = "USER_ID") )
	@CollectionId(columns = { @Column(name = "ORDER_ID") }, generator = "hilo-gen", type = @Type(type = "long") )
	private Collection<Order> orders = new ArrayList<Order>();
	// private Set<Order> orders = new HashSet<>();
	
	/**
	 * @return the orders
	 */
	/*
	 * public final Set<Order> getOrders() { return orders; }
	 * 
	 *//**
		 * @param orders
		 *            the orders to set
		 *//*
		 * public final void setOrders(Set<Order> orders) { this.orders =
		 * orders; }
		 */

	/**
	 * @return the homeAddress
	 */
	public final Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @return the orders
	 */
	public final Collection<Order> getOrders() {
		return orders;
	}

	/**
	 * @param orders
	 *            the orders to set
	 */
	public final void setOrders(Collection<Order> orders) {
		this.orders = orders;
	}

	/**
	 * @param homeAddress
	 *            the homeAddress to set
	 */
	public final void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	/**
	 * @return the officeAddress
	 */
	public final Address getOfficeAddress() {
		return officeAddress;
	}

	/**
	 * @param officeAddress
	 *            the officeAddress to set
	 */
	public final void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	/**
	 * @return the gender
	 */
	public final String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public final void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the joiningDate
	 */
	public final Date getJoiningDate() {
		return joiningDate;
	}

	/**
	 * @param joiningDate
	 *            the joiningDate to set
	 */
	public final void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	/**
	 * @return the address
	 */
	/*
	 * public final String getAddress() { return address; }
	 * 
	 *//**
		 * @param address
		 *            the address to set
		 *//*
		 * public final void setAddress(String address) { this.address =
		 * address; }
		 */

	/**
	 * @return the description
	 */
	public final String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public final void setDescription(String description) {
		this.description = description;
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
