package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.bean.Account;
import com.bean.Customer;
import com.dao.GetCustomerStatusDao;
import com.service.GetAccountDataService;

/**
 * Servlet implementation class GetAccountDataController
 */
@WebServlet("/GetAccountDataController")
public class GetAccountDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAccountDataController() {
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
		GetAccountDataService service=new GetAccountDataService();
		Account cust=new Account();
		System.out.println("hello");

		try {
				ArrayList<Account> acc_list=service.getAccountDetailsService(ssn,id);
				
				ObjectMapper mapper = new ObjectMapper();
			      //Converting the Object to JSONString
			      String jsonString = mapper.writeValueAsString(acc_list);
				
				response.setContentType("text/plain");
				response.getWriter().write(jsonString);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
