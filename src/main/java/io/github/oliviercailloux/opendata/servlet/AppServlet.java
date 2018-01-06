package io.github.oliviercailloux.opendata.servlet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import biweekly.ICalendar;
import ezvcard.Ezvcard;
import ezvcard.VCard;
import io.github.oliviercailloux.opendata.entity.Course;
import io.github.oliviercailloux.opendata.entity.Planning;
import io.github.oliviercailloux.opendata.entity.Teaching;
import io.github.oliviercailloux.opendata.mapper.ICalendarMapper;


/**
 * Created by Ziad on 07/11/2017.
 */



@WebServlet("/appServlet")
public class AppServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.setContentType(MediaType.TEXT_PLAIN);
        final ServletOutputStream out = resp.getOutputStream();

        // TRY TEACHING FORMAT ...
        Course course = new Course();
        course.setDescription("test");
        Teaching teaching = new Teaching(course, LocalDateTime.now(),"","" );

        out.println("TEST : "+teaching.getDateWithFormat("dd MM YYYY"));
        out.println("TEST null : "+teaching.getDateWithFormat(null));
        
        String str =
        		"BEGIN:VCARD\r\n" +
        		"VERSION:4.0\r\n" +
        		"N:Doe;Jonathan;;Mr;\r\n" +
        		"FN:John Doe\r\n" +
        		"END:VCARD\r\n";

		VCard vcard = Ezvcard.parse(str).first();
		String fullName = vcard.getFormattedName().getValue();
		out.println(fullName);
		
		// Test ICalendarMapper
		Planning planning = new Planning();
		List<Teaching> teachings = new ArrayList();
		teachings.add(teaching);
		
		planning.setTeachings(teachings);
		ICalendarMapper iCalendarMapper = new ICalendarMapper();
		
		ICalendar ical = iCalendarMapper.encodePlanningToICalendar(planning);
		
		out.println(ical.toString());
		
    }
}

