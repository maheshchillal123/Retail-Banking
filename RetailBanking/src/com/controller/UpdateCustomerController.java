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
import com.service.UpdateCustomerService;

/**
 * Servlet implementation class UpdateCustomerController
 */
@WebServlet("/UpdateCustomerController")
public class UpdateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomerController() {
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
		PrintWriter out=response.getWriter();
		Customer cust=new Customer();
		UpdateCustomerService service=new UpdateCustomerService();
		cust.setCust_id(Integer.parseInt(request.getParameter("cust_id")));
		cust.setCust_name(request.getParameter("newcust_name"));
		cust.setCust_address(request.getParameter("newcust_address"));
		cust.setCust_age(Integer.parseInt(request.getParameter("newcust_age")));
		try {
			boolean flag=service.UpdateCustomerDataService(cust);
			if(flag) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Customer Data Updated Successfully');");
				out.println("location='UpdateCustomer.jsp'");
				out.println("</script>");
			}
			else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Customer Data Not Updated');");
				out.println("location='UpdateCustomer.jsp'");
				out.println("</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
