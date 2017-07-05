package com.sanju.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sanju.login.model.User;
import com.sanju.login.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		LoginService service = new LoginService();
		if (service.authenticate(name, password)) {
			service.setUser(name, password);
		    User user = new User();
		    user.setName(name);
		    user.setPassword(password);
		    request.getSession().setAttribute("user", user);
		    request.getSession().setAttribute("from", "login");
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
