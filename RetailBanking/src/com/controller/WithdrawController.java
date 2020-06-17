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

import com.bean.Transfer;
import com.service.DepositService;
import com.service.WithdrawService;

/**
 * Servlet implementation class WithdrawController
 */
@WebServlet("/WithdrawController")
public class WithdrawController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawController() {
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
		WithdrawService service=new WithdrawService();
		Transfer trans=new Transfer();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String time=timestamp.toString().replaceAll("-","");
		time=time.replaceAll(":","");
		time=time.replace(".","");
		time=time.replace(" ","");
		
		trans.setCust_id(Integer.parseInt(request.getParameter("cust_id")));
		trans.setAcc_id(Integer.parseInt(request.getParameter("acct_id")));
		trans.setAcc_type(request.getParameter("acct_type"));
		trans.setBefore_balance(Integer.parseInt(request.getParameter("balance")));
		trans.setTrans_balance(Integer.parseInt(request.getParameter("withdraw_amt")));
		trans.setTrans_id(time);
		trans.setTrans_date(timestamp.toString());
		trans.setTrans_type("Withdraw");

		try {
			int total = service.withdrawMoneyService(trans);
			if(total!=-1) {
				String msg=trans.getTrans_balance()+" Rs Withdraw from "+trans.getAcc_id()+" Account. Total Balance is"+total;
				out.println("<script type=\"text/javascript\">");
				out.println("alert('" + msg +"')");
				out.println("location='AccountSearch.jsp'");
				out.println("</script>");
			}
			else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Amount not Withdraw');");
				out.println("location='AccountSearch.jsp'");
				out.println("</script>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
