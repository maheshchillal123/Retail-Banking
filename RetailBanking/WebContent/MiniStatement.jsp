<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.bean.Transfer"%>
<%@ page import="com.service.CustomerStatusTableService"%>
<%@ page import="com.service.StatementTableService"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.ParseException"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
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
									<h1>Mini Statement</h1>
								</center>
							</div>
						</div>

						<%
						ArrayList<Transfer> trans = new ArrayList<Transfer>();
						StatementTableService service = new StatementTableService();
							if(request.getParameter("optionsRadios").equals("option1")){
								int no_trans=Integer.parseInt(request.getParameter("no_trans"));
								System.out.println(no_trans);
								trans = service.getStatementStatusTable(request.getParameter("acc_id"),no_trans);
							}else{
								System.out.println(request.getParameter("start")+" "+request.getParameter("end"));
								DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
								
						        Date date = sdf.parse(request.getParameter("start"));
						        String start=new SimpleDateFormat("yyyy-MM-dd").format(date);
						        
						        Date date1 = sdf.parse(request.getParameter("end"));
						        String end=new SimpleDateFormat("yyyy-MM-dd").format(date1);
						        
								trans = service.getStatementStatusTableByDate(request.getParameter("acc_id"),start,end);
							}
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
														Customer <span class="table-project-n">Data</span> Table
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
																<th data-field="transid" data-editable="false">Transaction ID</th>
																<th data-field="description" data-editable="false">Description</th>
																<th data-field="date" data-editable="false">Date</th>
																<th data-field="amount" data-editable="false">Amount</th>
															</tr>
														</thead>
														<tbody>

															<%
																for (Transfer tu : trans) {
															%><tr>
																<td><%=tu.getTrans_id()%></td>
																<td><%=tu.getTrans_type()%></td>
																<td><%=tu.getTrans_date()%></td>
																<td><%=tu.getTrans_balance()%></td>
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