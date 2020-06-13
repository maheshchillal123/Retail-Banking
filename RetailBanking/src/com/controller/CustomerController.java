package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Customer;
import com.service.CustomerService;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
		CustomerService service=new CustomerService();
		Customer cust=new Customer();
		
		if(request.getParameter("source").equals("CreateCustomer")) {
			
			cust.setCust_ssn(Integer.parseInt(request.getParameter("cust_ssn")));
			cust.setCust_name(request.getParameter("cust_name"));
			cust.setCust_age(Integer.parseInt(request.getParameter("cust_age")));
			cust.setCust_address(request.getParameter("cust_address"));
			cust.setCust_state(request.getParameter("cust_state"));
			cust.setCust_city(request.getParameter("cust_city"));
			try {
				boolean flag=service.createCustomerService(cust);
				if(flag) {
					int customer_id=service.getCustomerIdservice();
					String msg=cust.getCust_name()+" your SSN number is "+cust.getCust_ssn()+" and Customer Id is "+customer_id+" note Down for future refrence.";
					out.println("<script type=\"text/javascript\">");
					out.println("alert('" + msg +"')");
					out.println("location='CreateCustomer.jsp'");
					out.println("</script>");
				}
				else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Customer not registered. Register again');");
					out.println("location='event.jsp'");
					out.println("</script>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(request.getParameter("source").equals("UpdateCustomer")) {
			
		}
	}

}
