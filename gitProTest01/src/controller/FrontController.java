package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.getWriter().println("Hello world");
	  response.getWriter().println("Kwondain");
	  response.getWriter().println("Hello2 world");
	  response.getWriter().println("test");
	  response.getWriter().println("june Test");
	}

}
