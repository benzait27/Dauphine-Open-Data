package io.github.oliviercailloux.opendata.servlet;

import io.github.oliviercailloux.opendata.entity.Course;
import io.github.oliviercailloux.opendata.mapper.JsonMapper;
import io.github.oliviercailloux.opendata.utils.JPAutil;
import io.github.oliviercailloux.opendata.utils.ServletHelper;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Ziad && Sofian on 08/02/2018.
 */
@WebServlet("/course")
public class CourseServlet extends HttpServlet {

    // getCourse(id):Course
    /**
     * Object for DB access
     */
    @Inject
    private JPAutil jpaUtil;

    /**
     * mapper json to object and object to json
     */
    @Inject
    private JsonMapper jsonMapper;


    private static final Logger LOGGER = Logger.getLogger(CourseServlet.class.getName());


    /**
     * return all Course (JSON format)
     *
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        @SuppressWarnings("resource")
        final ServletOutputStream out = new ServletHelper().configureAndGetOutputStream(response);
        // Add content type (JSON format)
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");


        EntityManager entityManager = jpaUtil.getEntityManager("Dauphine-Open-Data");

        LOGGER.info("we retrieve the list of courses");

        // get All the Course
        List<Course> courses = entityManager.createQuery("select c from Course c").getResultList();

        if (courses != null) {
            LOGGER.info(" list of courses size : " + courses.size());
        }

        // convert to JSON
        String json = jsonMapper.convertObjectToJson(courses);
        out.println(json);
    }


}