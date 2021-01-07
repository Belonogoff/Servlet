package ru.belonogoff.testServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get")
public class GetCookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        String cookieName = "user";
        Cookie cookie = null;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (cookieName.equals(c.getName())) {
                    cookie = c;
                    break;
                }
            }
        }
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>" + "Name: " + cookie.getValue() + "</h1>");
            out.println("<a href=\"index.jsp\">back</a>");
        }
    }
}
