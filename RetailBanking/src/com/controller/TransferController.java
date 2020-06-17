package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Account;
import com.bean.Transfer;
import com.dao.TransferDao;
import com.service.TransferService;

/**
 * Servlet implementation class TransferController
 */
@WebServlet("/TransferController")
public class TransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferController() {
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
		TransferService service=new TransferService();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String time=timestamp.toString().replaceAll("-","");
		time=time.replaceAll(":","");
		time=time.replace(".","");
		time=time.replace(" ","");
		
		try {
			Transfer src=new Transfer();
			Transfer trg=new Transfer();
			
			ArrayList<Account> lst = TransferDao.checkStatusOfTarget(request.getParameter("cust_id"));
			src.setAcc_id(Integer.parseInt(request.getParameter("src_account")));
			src.setAcc_type(request.getParameter("srcacct_type"));
			src.setCust_id(Integer.parseInt(request.getParameter("cust_id")));
			src.setTrans_id(time);
			src.setTrans_date(timestamp.toString());
			src.setTrans_type("Transfer");
			src.setTrans_balance(Integer.parseInt(request.getParameter("transfer_amt")));
			src.setBefore_balance(Integer.parseInt(request.getParameter("src_balance")));
			
			
			trg.setAcc_type(request.getParameter("taracct_type"));
			for(Account a:lst) {
				if(a.getAcc_type().equals(trg.getAcc_type())) {
					trg.setAcc_id(a.getAcc_id());
					trg.setBefore_balance(a.getCurrent_balance());
				}
			}
			trg.setCust_id(Integer.parseInt(request.getParameter("cust_id")));
			
			ArrayList flag=service.transferAmountService(src,trg);
			String msg="Source Account "+src.getAcc_id()+" --> Before Transaction :- "+src.getBefore_balance()+" Rs --> After Transaction :- "+flag.get(0)+" Rs.";
			String msg2=" Target Account "+trg.getAcc_id()+" --> Before Transaction :- "+trg.getBefore_balance()+" Rs --> After Transaction :- "+flag.get(flag.size() - 1)+" Rs.";
			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('" + msg+msg2+"');");
			out.println("location='AccountSearch.jsp'");
			out.println("</script>");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
