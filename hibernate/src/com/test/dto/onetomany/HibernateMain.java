package com.test.dto.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {
	public static void main(String[] args) {
		VehicleOneToMany vehicle = new VehicleOneToMany();
		UserDetailsOneToMany details = new UserDetailsOneToMany();
		vehicle.setVehicleName("AUDI");

		VehicleOneToMany vehicle1 = new VehicleOneToMany();
		vehicle1.setVehicleName("BMW");
		details.getVehicle().add(vehicle);
		details.getVehicle().add(vehicle1);
		details.setUserName("Pradeep");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Inserting
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(details);
		session.save(vehicle);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();

	}

}
