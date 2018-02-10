package io.github.oliviercailloux.opendata.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.oliviercailloux.opendata.entity.Course;
import io.github.oliviercailloux.opendata.entity.Person;
import io.github.oliviercailloux.opendata.utils.JPAutil;

/**
 * Servlet implementation class DeletAll
 */
@WebServlet("/DeletAll")
public class DeletAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		JPAutil j= new JPAutil();
		 EntityManager entityManager=j.getEntityManager("Dauphine-Open-Data");

		 //delete all the course on the BDD
	     List<Person> Persons =entityManager.createQuery("select c from Person c").getResultList();
		 EntityTransaction tx = entityManager.getTransaction();
	
		 tx.begin();
		 for (Person person : Persons) { 
			 Person  PersonDeleted =entityManager.merge(person); 
		     entityManager.remove(PersonDeleted);   
		}
		 tx.commit();
		 
	        
	      
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
