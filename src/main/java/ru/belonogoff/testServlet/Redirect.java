package ru.belonogoff.testServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class Redirect extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String id = request.getParameter("id");

        if (id == null) {
            String path = request.getContextPath() + "/transfer";
            response.sendRedirect(path);
        } else {
            response.setContentType("text/html");

            try (PrintWriter writer = response.getWriter()) {
                writer.println("<h2>Id " + id + "</h2>");
                writer.println("<a href=\"index.jsp\">back</a>");
            }
        }
    }
}
