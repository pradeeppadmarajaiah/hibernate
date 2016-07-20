package com.test.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.dto.Employee;
import com.test.dto.Vehicle;

public class HibernateMainChapter3 {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("AUDI");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("AUDI");
		Employee employee = new Employee();
		employee.setEmployeeName("Pradeep");
		employee.getVehicle().add(vehicle);
		employee.getVehicle().add(vehicle2);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Inserting
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();

	}

}
