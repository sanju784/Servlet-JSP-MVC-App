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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		
		if(password == null || password == "" || !password.equals(password2)) {
			response.sendRedirect("register.jsp");
			return;
		} else {
		    LoginService service = new LoginService();
		    service.setUser(name, password);
		    User user = new User();
		    user.setName(name);
		    user.setPassword(password);
		    request.getSession().setAttribute("user", user);
		    request.getSession().setAttribute("from", "register");
		    response.sendRedirect("success.jsp");
		    return;
		}
	}

}
