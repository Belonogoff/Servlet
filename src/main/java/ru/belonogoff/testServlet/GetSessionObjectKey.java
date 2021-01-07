package ru.belonogoff.testServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/sessiondata")
public class GetSessionObjectKey extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            Enumeration keys = session.getAttributeNames();

            if(keys.hasMoreElements()) {
                out.println("<h2>" + "Sessions data: " + "</h2>");
                while(keys.hasMoreElements()){
                    out.println("<h2>" + (String) keys.nextElement() + "</h2>");
                }
                out.println("<a href=\"index.jsp\">back</a>");
            }
            else {
                out.println("<h2>" + "No sessions data" + "</h2>");
                out.println("<a href=\"index.jsp\">back</a>");
            }

        }
    }

}
