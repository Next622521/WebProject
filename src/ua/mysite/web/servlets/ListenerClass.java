package ua.mysite.web.servlets;


import ua.mysite.web.model.Dog;

import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerClass implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog d = new Dog(dogBreed);
        sc.setAttribute("dog", d);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
