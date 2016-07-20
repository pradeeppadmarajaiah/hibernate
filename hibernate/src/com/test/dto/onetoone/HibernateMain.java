package com.test.dto.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
	public static void main(String[] args) {
		com.test.dto.onetoone.VehicleOneToOne vehicle = new VehicleOneToOne();
		vehicle.setVehicleName("AUDI");

		com.test.dto.onetoone.UserDetailsOneToOne details = new UserDetailsOneToOne();

		details.setUserName("Pradeep");
		details.setVehicleOneToOne(vehicle);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Inserting
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(details);
		session.save(vehicle);

		session.getTransaction().commit();
		session.close();

	}

}
