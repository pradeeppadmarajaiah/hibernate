package com.test.util;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.dto.Address;
import com.test.dto.Order;
import com.test.dto.UserDetails;

public class HibernateMain {
	public static void main(String[] args) {

		Address address = new Address();
		address.setStreet("First Cross");
		address.setCity("Bangalore");
		address.setZipcode("560017");
		address.setState("Karanataka");

		Order order = new Order();
		order.setOrderLineItemName("Line1");
		order.setOrderPrice(1);

		Order order2 = new Order();
		order2.setOrderLineItemName("Line2");
		order2.setOrderPrice(2);

		UserDetails details = new UserDetails();

		details.setUserName("Pradeep");
		details.setHomeAddress(address);
		details.setOfficeAddress(address);
		details.setDescription("kannada");
		details.setJoiningDate(new Date());
		details.getOrders().add(order);
		details.getOrders().add(order2);

		UserDetails details2 = new UserDetails();
		details2.setUserName("raj");
		details2.setHomeAddress(address);
		details2.setOfficeAddress(address);
		details2.setDescription("Hindi");
		details2.setJoiningDate(new Date());
		details2.getOrders().add(order);
		details2.getOrders().add(order2);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Inserting
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(details);
		session.save(details2);
		session.getTransaction().commit();
		session.close();

		// Fetching
		details = null;
		Session session2 = factory.openSession();
		session2.beginTransaction();
		details = (UserDetails) session2.get(UserDetails.class, 1);
		System.out.println(details.getDescription());

	}

}
