package com.javawebtutor.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.javawebtutor.jpa.pojo.Employee;

public class Test {
	public static void main(String[] args) {
		// **************************************************************************************
		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPACRUD");
 
		/* Create  Entity */
		Employee employee = new Employee();
		employee.setNombre("Mukesh");
		employee.setEmail("m@gmail.com");
		employee.setPassword("123123");
		employee.setSexo("Masculino");
		employee.setPais("ECUADOR");
 
		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();
 
		/* Persist entity */
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		// **************************************************************************************
		
		
		// *****************METODO OBTENER DATOS *************************************************
		/* Retrieve entity */
		employee = em.find(Employee.class, 12);
		System.out.println(employee);
		
		// *****************Actualizar entidad *************************************************
		/* Update entity */
		em.getTransaction().begin();
		employee.setNombre("Ravi");
		System.out.println("Update Employee Name is  :- " + employee);
		em.getTransaction().commit();
 
		/* Remove entity */
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
 
		/* Check whether enittiy is removed or not */
		employee = em.find(Employee.class, 12);
		System.out.println("Employee after removal :- " + employee);
 
	}
}

