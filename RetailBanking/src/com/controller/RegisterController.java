package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.LoginService;
import com.service.RegisterService;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		RegisterService service=new RegisterService();
		try {
			String pass=request.getParameter("pass");
			String cpass=request.getParameter("cpass");
			if(pass.equals(cpass)) {
				boolean flag=service.registerExecutive(request.getParameter("email"),request.getParameter("pass"));
				if(flag) {
					
					out.println("<script type=\"text/javascript\">");
					out.println("alert('register Successfully')");
					out.println("location='index.html'");
					out.println("</script>");
				}else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Not Registered. Register Again.')");
					out.println("location='Register.jsp'");
					out.println("</script>");
				}
			}
			else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('password should be same.')");
				out.println("location='Register.jsp'");
				out.println("</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
