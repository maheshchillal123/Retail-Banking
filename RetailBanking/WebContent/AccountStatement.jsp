<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="">
<title>Account Statement</title>
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
<!-- calendar CSS
		============================================ -->
<link rel="stylesheet" href="css/fullcalendar.min.css">
<link rel="stylesheet" href="css/fullcalendar.print.min.css">
<!-- datapicker CSS
		============================================ -->
<link rel="stylesheet" href="css/datepicker3.css">
<!-- select2 CSS
		============================================ -->
<link rel="stylesheet" href="css/select2.min.css">
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
									<h1>Account Statement</h1>
								</center>
							</div>
						</div>
						<div class="sparkline12-graph">
							<div class="basic-login-form-ad">
								<div class="row">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<div class="all-form-element-inner">
											<form action="MiniStatement.jsp" method="post">
												<input type="hidden" name="source" value="CreateCustomer">
												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
															<label class="login2 pull-right pull-right-pro">Account
																ID</label>
														</div>
														<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
															<input type="number" class="form-control" name="acc_id" required="required"/>
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12"></div>
													</div>
												</div>
												<div class="form-group-inner">
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3"></div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
															<div class="bt-df-checkbox">
																<input class="pull-left radio-checked" type="radio"
																	checked="" value="option1" id="optionsRadios1"
																	name="optionsRadios">Last Number Of Transaction
															</div>
														</div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
															<div class="form-select-list">
																<select class="form-control custom-select-value"
																	name="no_trans">
																	<option value="1">1</option>
																	<option value="2">2</option>
																	<option value="3">3</option>
																	<option value="4">4</option>
																	<option value="5">5</option>
																	<option value="6">6</option>
																	<option value="7">7</option>
																	<option value="8">8</option>
																	<option value="9">9</option>
																	<option value="10">10</option>
																</select>
															</div>
														</div>
													</div>
													</br>
													<div class="row">
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3"></div>
														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
															<div class="bt-df-checkbox">
																<input class="pull-left" type="radio" value="option2"
																	id="optionsRadios2" name="optionsRadios">Start
																End Dates
															</div>
														</div>

														<div class="col-lg-3 col-md-3 col-sm-3 col-xs-3">
															<div class="form-group data-custon-pick data-custom-mg"
																id="data_5">
																<div class="input-daterange input-group" id="datepicker">
																	<input type="text" class="form-control" name="start"
																		value="05/14/2014" /> <span class="input-group-addon">to</span>
																	<input type="text" class="form-control" name="end"
																		value="05/22/2014" />
																</div>
															</div>
														</div>

													</div>
												</div>
												<div class="form-group-inner">
													<div class="login-btn-inner">
														<div class="row">
															<div class="col-lg-3"></div>
															<div class="col-lg-9">
																<div
																	class="login-horizental cancel-wp pull-left form-bc-ele">
																	<button class="btn btn-white" type="reset">Cancel</button>
																	<button class="btn btn-sm btn-primary login-submit-cs"
																		type="submit">Submit</button>
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
								<p>Retail Bank Case Study Developed By : Mahesh Chillal</p>
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
	<!-- datapicker JS
		============================================ -->
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/datepicker-active.js"></script>
	<!-- select2 JS
		============================================ -->
	<script src="js/select2.full.min.js"></script>
	<script src="js/select2-active.js"></script>
</body>

</html>
