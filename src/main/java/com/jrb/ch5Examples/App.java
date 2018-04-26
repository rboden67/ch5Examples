package com.jrb.ch5Examples;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test-jpa");
		System.out.println(entityManagerFactory.isOpen());
	}
}
