package io.github.oliviercailloux.opendata.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import io.github.oliviercailloux.opendata.entity.Course;
import io.github.oliviercailloux.opendata.utils.JPAutil;



//classe contenant les m�thodes g�n�riques sauver,  supprimer, consulter par cl� primaire (Id)
public  class ObjectDao {
private EntityManager entityManager=JPAutil.getEntityManager("Dauphine-Open-Data");
 
 
//m�thode ajouter d'une entit� �  la bd
	 public   void ajouter(Object c)
	{
	 	EntityTransaction tx = entityManager.getTransaction();
	 	tx.begin();
	 	entityManager.persist(c);
	 	tx.commit();
	 	  
	}
	 //m�thode Modifier d'une entit� �  partir de la bd
	 public   void modifier(Object c)
		{
		 	EntityTransaction tx = entityManager.getTransaction();
		 	tx.begin();
		 	entityManager.merge(c);
		 	tx.commit();
		}
	 
	 //m�thode Supprimer d'une entit� �  partir de la bd
	 public  void supprimer(Object c)
	{


		EntityTransaction tx = entityManager.getTransaction();
	    tx.begin();
	    Object c2=entityManager.merge(c); // important
	    entityManager.remove(c2);
	    tx.commit();

	 	   
	}
	 //m�thode Consulter d'une entit� �  partir de la bd
	 public  Object Consulter(Object c,Object id)
	{
	
		 Object c2= entityManager.find(c.getClass(), id) ;
	 	return  c2;
		 

		}
	 
	 //m�thode pour lister tous les objets �  partir de la bd
	 public List<Object> Lister(Object c) {
		
		 List<Object> Objects =entityManager.createQuery("select c from  "+c.getClass()+" c").getResultList();
		 return Objects;
		
		 }
	 
}
