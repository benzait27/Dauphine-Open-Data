package io.github.oliviercailloux.opendata.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	
	private  EntityManagerFactory factory;
	private   EntityManager entityManager;
	
	//public static EntityManager getEntityManager(String pu)
	
	public EntityManager getEntityManager(String persistUnit) {
		
		if (entityManager==null)
		{
			factory =  Persistence.createEntityManagerFactory(persistUnit);
			
		  entityManager =
			  factory.createEntityManager();
		}
		  
		return entityManager;
	}
}
