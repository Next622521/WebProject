package ua.mysite.web.servlets;

import ua.mysite.web.model.Dog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListenerTester extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       Dog dog =  (Dog)getServletContext().getAttribute("dog");

        resp.getWriter().write("Its work " + dog.getBreed());
    }
}
