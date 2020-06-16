package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.dao.UpdateAccountStatusMessageDao;
import com.dao.UpdateCustomerStatusMessageDao;
import com.service.CreateAccountService;

/**
 * Servlet implementation class CreateAccountController
 */
@WebServlet("/CreateAccountController")
public class CreateAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccountController() {
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
		Account acc=new Account();
		PrintWriter out=response.getWriter();
		CreateAccountService service=new CreateAccountService();
		String amt=request.getParameter("deposite_amt");
		String cust_id=request.getParameter("cust_id");
		acc.setCust_id(Integer.parseInt(request.getParameter("cust_id")));
		acc.setAcc_type(request.getParameter("acct_type"));
		acc.setCurrent_balance(Integer.parseInt(request.getParameter("deposite_amt")));
		
		try {
			boolean flag=service.addAccountService(acc);
			
			if(flag) {
				int account_id=service.getAccountIdservice();
				boolean updatemsg=UpdateAccountStatusMessageDao.UpdateAccountStatus(account_id, "Account Created");
				String msg="Your account number is "+account_id+" note Down for future refrence.";
				out.println("<script type=\"text/javascript\">");
				out.println("alert('" + msg +"')");
				out.println("location='CreateAccount.jsp'");
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

}
