package ru.belonogoff.testServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        int x = 0;
        int y = 8 / x;
    }
}
