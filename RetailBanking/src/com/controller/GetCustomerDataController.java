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
import com.dao.GetCustomerStatusDao;
import com.service.CustomerService;
import com.service.GetCustomerDataService;

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
		GetCustomerDataService service=new GetCustomerDataService();
		Customer cust=new Customer();
		System.out.println("hello");

		try {
			String status=GetCustomerStatusDao.getCustomerStatus(ssn,id);
			if(status.equals("Active")) {
				Customer cust_info=service.getUpdateDetailsService(ssn,id);
				
				ObjectMapper mapper = new ObjectMapper();
			      //Converting the Object to JSONString
			      String jsonString = mapper.writeValueAsString(cust_info);
				
				response.setContentType("text/plain");
				response.getWriter().write(jsonString);
			}
			else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Customer Not Exist');");
				out.println("</script>");
			}
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

	}

}
