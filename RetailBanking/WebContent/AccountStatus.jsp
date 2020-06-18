<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="com.bean.Account"%>
<%@ page import="com.service.AccountStatusTableService"%>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="">
<title>Account Status</title>
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
<!-- normalize CSS
		============================================ -->
<link rel="stylesheet" href="css/bootstrap-table.css">
<!-- responsive CSS
		============================================ -->
<link rel="stylesheet" href="css/responsive.css">
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
									<h1>Account Status</h1>
								</center>
							</div>
						</div>

						<%
							ArrayList<Account> acc = new ArrayList<Account>();
						AccountStatusTableService service = new AccountStatusTableService();
						acc = service.getAccountStatusTable();
						%>

						<!-- Static Table Start -->
						<div class="data-table-area mg-b-15">
							<div class="container-fluid">
								<div class="row">
									<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
										<div class="sparkline13-list">
											<div class="sparkline13-hd">
												<div class="main-sparkline13-hd">
													<h1>
														Account <span class="table-project-n">Data</span> Table
													</h1>
												</div>
											</div>
											<div class="sparkline13-graph">
												<div
													class="datatable-dashv1-list custom-datatable-overright">
													<div id="toolbar">
														<select class="form-control dt-tb">
															<option value="">Export Basic</option>
															<option value="all">Export All</option>
														</select>
													</div>
													<table id="table" data-toggle="table"
														data-pagination="true" data-search="true"
														data-show-columns="true"
														data-show-pagination-switch="true"
														data-show-refresh="true" data-key-events="true"
														data-show-toggle="true" data-resizable="true"
														data-cookie="true" data-cookie-id-table="saveId"
														data-show-export="true" data-click-to-select="true"
														data-toolbar="#toolbar">
														<thead>
															<tr>

																<th data-field="customerid" data-editable="false">Customer
																	ID</th>
																<th data-field="accountid" data-editable="false">Account
																	ID</th>
																<th data-field="status" data-editable="false">Status</th>
																<th data-field="accounttype" data-editable="false">Account
																	Type</th>

																<th data-field="message" data-editable="false">Message</th>
																<th data-field="lastupdated" data-editable="false">Last
																	Updated</th>
																<th data-field="operations" data-editable="false">Operation</th>
															</tr>
														</thead>
														<tbody>

															<%
																for (Account au : acc) {
															%><tr>
																<td><%=au.getCust_id()%></td>
																<td><%=au.getAcc_id()%></td>
																<td>
																	<%
																		if (au.getAcc_status().equals("Active")) {
																	%>
																	<button class="pd-setting" disabled="disabled"><%=au.getAcc_status()%></button>
																	<%
																		} else {
																	%>
																	<button class="ds-setting" disabled="disabled"><%=au.getAcc_status()%></button>
																	<%
																		}
																	%>
																</td>
																<td><%=au.getAcc_type()%></td>
																<td><%=au.getMsg()%></td>
																<td><%=au.getLast_update()%></td>
																<td><a href="AccountStatus.jsp"><u>Refresh</u></a></td>
															</tr>
															<%
																}
															%>
														</tbody>
													</table>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- Static Table End -->
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
	<!-- data table JS
            ============================================ -->
	<script src="js/bootstrap-table.js"></script>
	<script src="js/tableExport.js"></script>
	<script src="js/data-table-active.js"></script>
	<script src="js/bootstrap-table-resizable.js"></script>
	<script src="js/colResizable-1.5.source.js"></script>
	<script src="js/bootstrap-table-export.js"></script>
</body>

</html>