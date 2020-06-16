package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UpdateAccountStatusMessageDao;
import com.service.DeleteAccountService;

/**
 * Servlet implementation class DeleteAccountController
 */
@WebServlet("/DeleteAccountController")
public class DeleteAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String acc_id=request.getParameter("account_id");
		DeleteAccountService service=new DeleteAccountService();
		try {
			boolean flag=service.DeleteAccountDataService(acc_id);
			if(flag) {
				boolean updatemsg=UpdateAccountStatusMessageDao.UpdateAccountStatus(Integer.parseInt(acc_id), "Account Deleted");
				String msg=acc_id+" Account Deleted.";
				out.println("<script type=\"text/javascript\">");
				out.println("alert('" + msg +"')");
				out.println("location='DeleteAccount.jsp'");
				out.println("</script>");
			}
			else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Account Not Deleted. Delete again');");
				out.println("location='DeleteAccount.jsp'");
				out.println("</script>");
			}
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
		doGet(request, response);
	}

}
