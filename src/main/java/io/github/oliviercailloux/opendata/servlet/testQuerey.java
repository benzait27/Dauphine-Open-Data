package io.github.oliviercailloux.opendata.servlet;

import io.github.oliviercailloux.opendata.entity.Course;
import io.github.oliviercailloux.opendata.utils.*;

/**
 * Created by Ziad on 07/11/2017.
 */

import ezvcard.Ezvcard;
import ezvcard.VCard;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.oliviercailloux.opendata.dao.ObjectDao;





@WebServlet("/testQuerey")
public class testQuerey  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	@SuppressWarnings("resource")
		final ServletOutputStream out = new ServletHelper().configureAndGetOutputStream(resp);
		out.println("I use an application-managed resource-local entity manager.");
		out.println("My persistence context is transaction-scoped (lifetime scoped to a single transaction).");
		out.flush();

	    Course c=  new Course("javaee");
        ObjectDao  od = new ObjectDao();
        od.ajouter(c);
      // Course c2 = od.Consulter(c, "2");
		//for (Course item : allItems) {
		//	out.println(c2.getCourseName());
	//	}
		out.println("End.");
    	
    }
    
}


