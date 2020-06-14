package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import com.bean.Customer;
import com.service.CustomerService;

/**
 * Servlet implementation class GetCustomerDataController
 */
@WebServlet("/GetCustomerDataController")
public class GetCustomerDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCustomerDataController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ssn = request.getParameter("ssn").trim();
		String id=request.getParameter("id").trim();

		
		PrintWriter out = response.getWriter();
		CustomerService service=new CustomerService();
		Customer cust=new Customer();
		System.out.println("hello");
		
		
		
		try {
			
			Customer cust_info=service.getUpdateDetailsService(ssn,id);
			
			ObjectMapper mapper = new ObjectMapper();
		      //Converting the Object to JSONString
		      String jsonString = mapper.writeValueAsString(cust_info);
			
			response.setContentType("text/plain");
			response.getWriter().write(jsonString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
