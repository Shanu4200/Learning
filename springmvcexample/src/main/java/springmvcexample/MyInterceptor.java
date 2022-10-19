package springmvcexample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is PreHandler");
		
		String name=request.getParameter("user");
		if(name.startsWith("B"))
		{
			response.setContentType("text/html");
			response.getWriter().println("<h1>Invalid name as it should not start with B</h1>");
			return false;
		}
	    return true;
	}
	

}
