<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="">
<title>deposit Money</title>
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
												<li class="nav-item"><a href="Home.jsp"
													class="nav-link">Home</a></li>
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
												<li class="nav-item"><a href="AccountStatement.jsp"
													class="nav-link">Print Account Statement</a></li>
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
									<h1>Deposite Money</h1>
								</center>
							</div>
						</div>
						<div class="sparkline12-graph">
							<div class="basic-login-form-ad">
								<div class="row">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<div class="all-form-element-inner">
											<form action="DepositController" method="post">
												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Customer
																ID</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control" name="cust_id"
																value="<%=request.getParameter("customer_id")%>"
																readonly />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Account
																ID</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control" name="acct_id"
																value="<%=request.getParameter("account_id")%>" readonly />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Account
																Type</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="text" class="form-control" name="acct_type"
																value="<%=request.getParameter("account_type")%>"
																readonly />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Balance</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control" name="balance"
																value="<%=request.getParameter("balance")%>" readonly />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Deposit
																Amount</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control"
																name="deposit_amt" />
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>

												<div class="form-group-inner">
													<div class="login-btn-inner">
														<div class="row">
															<div class="col-lg-3"></div>
															<div class="col-lg-9">
																<div
																	class="login-horizental cancel-wp pull-left form-bc-ele">
																	<button class="btn btn-white" type="submit">Cancel</button>
																	<button class="btn btn-sm btn-primary login-submit-cs"
																		type="submit">Deposit</button>
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
								<p>Retail Bank Case Study Developed By :</p>
								<div class="row">
									<div class="col-md-6">
										<p>Mr. Mahesh Shivabasappa Chillal --> CT20182444458</p>
										<p>Mr. Kiran Krishna Joshi --> CT20192628008</p>
									</div>
									<div class="col-md-6">
										<p>Miss. Gayatri Prabhakar Gundla --> CT20182444807</p>
										<p>Miss. Sajiri Sunil Gokak --> CT20182445124</p>
									</div>
								</div>
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