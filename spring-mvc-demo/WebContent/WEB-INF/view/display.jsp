    
    <%@ page import="java.util.Date" %>
    <%
    		Date date=new Date();  
    String name=request.getParameter("name");  
    out.print("welcome "+name+" "+date.getDate());  
    %> 
    </br></br>
       <%="Hello, "+name %>   
       
       </br></br>
       
       ${param.name}
       </br></br>
       
       <h1>The message :: ${message} </h1>