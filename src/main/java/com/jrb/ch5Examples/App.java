package com.jrb.ch5Examples;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		Student student = new Student(); 
		student.setFirstName("John"); 
		student.setLastName("Doe"); 
		Book book1 = new Book(); 
		book1.setName("Book 1"); 
		Book book2 = new Book(); 
		book2.setName("Book 2");
		student.getBooks().add(book1);
		student.getBooks().add(book2);
		System.out.println(student.getBooks());
		entityManager.persist(student);
		transaction.commit();
		
//		transaction.begin();
//		Student student = entityManager.find(Student.class, 1L);
//		Book book2 = entityManager.getReference(Book.class, 2L);
//		student.setFirstName("Joe");
//		entityManager.remove(book2);
//		transaction.commit();

		entityManager.close();
	}
}
