package ru.belonogoff.testServlet;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param")
public class ParamFromRequest extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        String name = request.getParameter("username");
        String age = request.getParameter("userage");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String[] courses = request.getParameterValues("courses");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Country: " + country + "</p>");
            writer.println("<h4>Courses</h4>");
            for (String course : courses)
                writer.println("<li>" + course + "</li>");
            writer.println("<a href=\"index.jsp\">home</a>");
            writer.println("<a href=\"param.html\">back</a>");
        }
    }
}