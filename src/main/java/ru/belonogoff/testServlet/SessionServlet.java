package ru.belonogoff.testServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/testsession")
public class SessionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        Person person = new Person(request.getParameter("name"), Integer.parseInt(request.getParameter("age")));
        session.setAttribute(request.getParameter("name"), person);

        String path = "/createSessionData.html";
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        HttpSession session = request.getSession();
        Person person = (Person) session.getAttribute(request.getParameter("name"));

        try (PrintWriter out = response.getWriter()) {

            out.println("<h2>" + "Name: " + person.getName() + " Age: " + person.getAge() + "</h2>");
            session.removeAttribute(request.getParameter("name"));
            out.println("<h2>" + "Person remove" + "</h2>");
            out.println("<a href=\"index.jsp\">back</a>");

        }
    }
}
