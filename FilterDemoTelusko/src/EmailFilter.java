

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/sendAction")
public class EmailFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("email");
		if(email.endsWith(".com")) {
			chain.doFilter(request, response);		
		}
		else {
			//pw.println("Please enter valid Email");
			RequestDispatcher rd=request.getRequestDispatcher("include.html");
			//rd.include(request, response);
			rd.forward(request, response);
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
