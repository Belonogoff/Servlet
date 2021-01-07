package ru.belonogoff.testServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/set")
public class SetCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {
            response.addCookie(new Cookie("user", "Tom"));
            out.println("<h1>" + "Cookie is set" + "</h1>");
            out.println("<a href=\"index.jsp\">back</a>");
        }
    }
}
