package ru.belonogoff.testServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/transfer")
public class ForwardingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("<h2>Forwarding successfully</h2>");
            writer.println("<a href=\"index.jsp\">back</a>");
        }
    }
}