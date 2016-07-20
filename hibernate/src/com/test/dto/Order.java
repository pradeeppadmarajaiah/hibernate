/**
 * 
 */
package com.test.dto;

import javax.persistence.Embeddable;

/**
 * @author pradeep
 *
 */
@Embeddable
public class Order {

	private int OrderPrice;
	private String OrderLineItemName;

	/**
	 * @return the orderPrice
	 */
	public final int getOrderPrice() {
		return OrderPrice;
	}

	/**
	 * @param orderPrice
	 *            the orderPrice to set
	 */
	public final void setOrderPrice(int orderPrice) {
		OrderPrice = orderPrice;
	}

	/**
	 * @return the orderLineItemName
	 */
	public final String getOrderLineItemName() {
		return OrderLineItemName;
	}

	/**
	 * @param orderLineItemName
	 *            the orderLineItemName to set
	 */
	public final void setOrderLineItemName(String orderLineItemName) {
		OrderLineItemName = orderLineItemName;
	}

}
