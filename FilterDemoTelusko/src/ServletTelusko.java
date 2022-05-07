import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendAction")
public class ServletTelusko extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	PrintWriter out=res.getWriter();
	String name=req.getParameter("email");
	/*
	 * ServletContext context=getServletContext(); String s=(String)
	 * context.getAttribute("email"); System.out.println("object>>> "+s);
	 */
	out.println("Welcome to Google!!! "+name);
	
}
}
