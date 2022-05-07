import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServ extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
//res.setContentType("CSV");
PrintWriter pw=res.getWriter();
String name=req.getParameter("name");
pw.println("Welcome "+name);
//System.out.println("Server name is "+req.getServerName()+req.getServerPort()+req.getServletPath());
}}
