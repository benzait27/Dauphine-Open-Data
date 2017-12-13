package io.github.oliviercailloux.opendata.servlet;

/**
 * Created by Ziad on 07/11/2017.
 */


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import io.github.oliviercailloux.opendata.entity.Teaching;

@WebServlet("/appServlet")
public class AppServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.setContentType(MediaType.TEXT_PLAIN);
        final ServletOutputStream out = resp.getOutputStream();

        // TRY TEACHING FORMAT ...
        Teaching teaching = new Teaching(null, LocalDateTime.now(),"","" );

        out.println("TEST : "+teaching.getDateWithFormat("dd MM YYYY"));
        out.println("TEST null : "+teaching.getDateWithFormat(null));
    }
}


