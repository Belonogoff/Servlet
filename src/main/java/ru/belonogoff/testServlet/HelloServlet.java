package ru.belonogoff.testServlet;

import java.io.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String message1 = getServletContext().getInitParameter("message1");
        String message2 = getServletConfig().getInitParameter("message2");

        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>" + message1 + " " + message2 + "</h1>");
            out.println("<a href=\"index.jsp\">back</a>");
        }
    }
}