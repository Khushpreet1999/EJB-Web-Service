<%-- 
    Document   : index
    Created on : 3-Feb-2022, 8:41:18 AM
    Author     : khushpreetkaurgulati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab 4!</h1>
    </body>    <%-- start web service invocation --%><hr/>
    <%
    try {
	com.service.Week4J2EEWebService_Service service = new com.service.Week4J2EEWebService_Service();
	com.service.Week4J2EEWebService port = service.getWeek4J2EEWebServicePort();
	 // TODO initialize WS operation arguments here
	double a = 28.0d;
	// TODO process result here
	double result = port.calculate(a);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
