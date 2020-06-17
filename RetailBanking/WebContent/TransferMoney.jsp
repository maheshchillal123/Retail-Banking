<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.Account"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.dao.TransferDao"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Google Fonts
		============================================ -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900"
	rel="stylesheet">
<!-- Bootstrap CSS
		============================================ -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Bootstrap CSS
        ============================================ -->
<link rel="stylesheet" href="css/font-awesome.min.css">
<!-- animate CSS
		============================================ -->
<link rel="stylesheet" href="css/animate.css">
<!-- style CSS
		============================================ -->
<link rel="stylesheet" href="css/style.css">
<!-- custom CSS
		============================================ -->
<link rel="stylesheet" href="css/custom.css">
</head>
<body>
	<div class="all-content-wrapper" style="margin-left: 0;">
		<div class="header-advance-area">
			<div class="header-top-area" style="left: 0;">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="header-top-wraper">
								<div class="row">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<div class="header-top-menu tabl-d-n">
											<ul class="nav navbar-nav mai-top-nav">
												<li class="nav-item"><a href="#" class="nav-link">Home</a>
												</li>
												<li class="nav-item dropdown res-dis-nn"><a href="#"
													data-toggle="dropdown" role="button" aria-expanded="false"
													class="nav-link dropdown-toggle">Customer Management <span
														class="angle-down-topmenu"><i
															class="fa fa-angle-down"></i></span></a>
													<div role="menu" class="dropdown-menu animated zoomIn">
														<a href="CreateCustomer.jsp" class="dropdown-item">Create
															Customer</a> <a href="UpdateCustomer.jsp"
															class="dropdown-item">Update Customer</a> <a
															href="DeleteCustomer.jsp" class="dropdown-item">Delete
															Customer</a> <a href="CustomerStatus.jsp"
															class="dropdown-item">Customer Status</a>
													</div></li>
												<li class="nav-item dropdown res-dis-nn"><a href="#"
													data-toggle="dropdown" role="button" aria-expanded="false"
													class="nav-link dropdown-toggle">Account Management <span
														class="angle-down-topmenu"><i
															class="fa fa-angle-down"></i></span></a>
													<div role="menu" class="dropdown-menu animated zoomIn">
														<a href="CreateAccount.jsp" class="dropdown-item">Create
															Account</a> <a href="DeleteAccount.jsp" class="dropdown-item">Delete
															Account</a> <a href="AccountStatus.jsp" class="dropdown-item">Account
															Status</a>
													</div></li>
												<li class="nav-item dropdown res-dis-nn"><a href="#"
													data-toggle="dropdown" role="button" aria-expanded="false"
													class="nav-link dropdown-toggle">Status Details <span
														class="angle-down-topmenu"><i
															class="fa fa-angle-down"></i></span></a>
													<div role="menu" class="dropdown-menu animated zoomIn">
														<a href="CustomerSearch.jsp" class="dropdown-item">Customer
															Search</a> <a href="AccountSearch.jsp" class="dropdown-item">Account
															Search</a>
													</div></li>
												<li class="nav-item dropdown res-dis-nn"><a href="#"
													data-toggle="dropdown" role="button" aria-expanded="false"
													class="nav-link dropdown-toggle">Account Operations <span
														class="angle-down-topmenu"><i
															class="fa fa-angle-down"></i></span></a>
													<div role="menu" class="dropdown-menu animated zoomIn">
														<a href="DepositMoney.jsp" class="dropdown-item">Deposit
															Money</a> <a href="WithdrawMoney.jsp" class="dropdown-item">Withdraw
															Money</a> <a href="TransferMoney.jsp" class="dropdown-item">Transfer
															Money</a> <a href="AccountStatement.jsp"
															class="dropdown-item">Print Account Statement</a>
													</div></li>
												<li class="nav-item"><a href="Logout.jsp"
													class="nav-link">Logout</a></li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			</br>
			<div class="row" style="margin-right: 0px;">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="sparkline12-list">
						<div class="sparkline12-hd">
							<div class="main-sparkline12-hd">
								<center>
									<h1>Transfer Money</h1>
								</center>
							</div>
						</div>
						<div class="sparkline12-graph">
							<div class="basic-login-form-ad">
								<div class="row">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<div class="all-form-element-inner">
											<form action="TransferController" method="post">
												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Customer
																ID</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control" name="cust_id"
																value="<%=request.getParameter("customer_id")%>"
																readonly="readonly" />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Source
																Account Type</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<div class="form-select-list">
																<input type="text" class="form-control"
																	name="srcacct_type"
																	value="<%=request.getParameter("account_type")%>"
																	readonly />
															</div>
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Target
																Account Type</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<div class="form-select-list">
																<%
																	String target;
																if (request.getParameter("account_type").equals("S")) {
																	target = "C";
																} else {
																	target = "S";
																}
																%>
																<input type="hidden" name="src_account" value="<%=request.getParameter("account_id")%>">
																<input type="hidden" name="src_balance" value="<%=request.getParameter("balance")%>">
																<input type="text" class="form-control"
																	name="taracct_type" value="<%=target%>" readonly />
															</div>
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>


												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Transfer
																Amount</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control"
																name="transfer_amt" />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>
												<div class="form-group-inner">
													<div class="login-btn-inner">
														<div class="row">
															<div class="col-lg-3"></div>
															<div class="col-lg-9">
																<div class="login-horizental cancel-wp pull-left form-bc-ele">

																	<%
																		try {
																		ArrayList<Account> lst = TransferDao.checkStatusOfTarget(request.getParameter("customer_id"));
																		if (lst.get(0).getAcc_status().equals("Active") && lst.get(lst.size() - 1).getAcc_status().equals("Active")) {
																	%>
																	
																	<button class="btn btn-white" type="submit">Cancel</button>
																	<button class="btn btn-sm btn-primary login-submit-cs"
																		type="submit">Transfer</button>
																	<%
																		}else{
																			PrintWriter o=response.getWriter();
																			o.println("<script type=\"text/javascript\">");
																			o.println("alert('Target Account Deleted You cannot make a Transation.');");
																			o.println("location='AccountSearch.jsp'");
																			o.println("</script>");
																			
																		}
																	} catch (Exception e) {
																		System.out.println(e.toString());
																	}
																	%>
																</div>
															</div>
														</div>
													</div>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			</br>
			<div class="footer-copyright-area">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12">
							<div class="footer-copy-right">
								<p>
									Copyright © 2018. All rights reserved. Template by <a
										href="https://colorlib.com/wp/templates/">Colorlib</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- jquery
		============================================ -->
	<script src="js/jquery-1.12.4.min.js"></script>
	<!-- bootstrap JS
		============================================ -->
	<script src="js/bootstrap.min.js"></script>
</body>

</html>