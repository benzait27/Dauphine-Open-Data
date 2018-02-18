package io.github.oliviercailloux.opendata.servlet;

import ezvcard.VCard;
import io.github.oliviercailloux.opendata.dao.Dao;
import io.github.oliviercailloux.opendata.entity.Person;
import io.github.oliviercailloux.opendata.mapper.JsonMapper;
import io.github.oliviercailloux.opendata.mapper.VcardMapper;
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
import java.util.logging.Logger;

/**
 * Created by Ziad && Sofian on 08/02/2018.
 */
@WebServlet("/person-id")
public class PersonBasic extends HttpServlet {


    /**
     * Object for query Database
     */
    @Inject
    private Dao dao;

    /**
     * mapper json to object and object to json
     */
    @Inject
    private JsonMapper jsonMapper;

    @Inject
    private VcardMapper vcardMapper;


    private static final Logger LOGGER = Logger.getLogger(PersonBasic.class.getName());


    /**
     * return person from specific iD (JSON format)
     * parameter id : id of a person*
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @SuppressWarnings("resource")
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final ServletOutputStream out = new ServletHelper().configureAndGetOutputStream(response);
        // Add content type (JSON format)
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        // check parameter
        String idPerson = request.getParameter("id");
        // check if exist else throw Illegal Argument exception
        if(idPerson == null){
            throw new IllegalArgumentException("We need id of a Person ! ");
        }

        LOGGER.info("we return person with id  : "+ idPerson);

        VCard vcard = dao.getPerson(idPerson);

        if (vcard != null) {
            LOGGER.info(" successful find person with id : "+idPerson);
            String json = jsonMapper.convertObjectToJson(vcard);
            out.println(json);

        }
        else{
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            out.println("Impossible to find person with id : "+ idPerson);
        }

        out.flush();

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}