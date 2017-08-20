package ua.mysite.web.servlets;
import ua.mysite.web.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class BeerClass extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException {
request.setAttribute("email",getServletConfig().getInitParameter("adminEmail"));
response.addHeader("A","AAA");
response.setHeader("A","AAA");
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);
        Cookie []cookie = request.getCookies();
        request.setAttribute("ip",request.getRemoteAddr());
        request.setAttribute("somethings",cookie);
        request.setAttribute("styles",result);
RequestDispatcher view = request.getRequestDispatcher("result.jsp");

view.forward(request,response);
    }
}