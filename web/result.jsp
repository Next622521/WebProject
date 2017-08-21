<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
        <%
 List styles = (List)request.getAttribute("styles");
 Iterator it = styles.iterator();
 out.print(request.getHeader("A"));
 while(it.hasNext()) {
 out.print("<br>try:" + it.next());
 }
 out.print(" ");
 out.print(request.getAttribute("adminEmail"));
 out.print(request.getCookies().length);
%>
</body>
</html>