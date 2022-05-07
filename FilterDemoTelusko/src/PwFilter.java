

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class PwFilter
 */
@WebFilter("/sendAction")
public class PwFilter implements Filter {



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//HttpServletRequest req=(HttpServletRequest)request;
		PrintWriter pw=response.getWriter();
		String pAss=request.getParameter("pw");
		//System.out.println("The password is "+pAss);
		if(pAss.length()>5) {
			chain.doFilter(request, response);	
		}
		else {
		pw.println("Reenter your PASSWORD!!");	
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
