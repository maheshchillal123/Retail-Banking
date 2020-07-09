<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="">
<title>Customer Search</title>
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
									<h1>Customer Search</h1>
								</center>
							</div>
						</div>
						</br>
						<div class="sparkline12-graph">
							<div class="basic-login-form-ad">

								<div class="all-form-element-inner">
									<input type="hidden" name="source" value="SearchCustomer">
									<div class="row">
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
											<label class="login2 pull-right pull-right-pro"
												style="margin: 0px; padding: 10px 0px;">Enter
												Customer SSN ID</label>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
											<input type="number" class="form-control" id="customer_ssn"
												name="customer_ssn" />
										</div>
										<div class="col-lg-1 col-md-1 col-sm-1 col-xs-12">
											<label class="login2 pull-right pull-right-pro"
												style="margin: 0px; padding: 10px 0px;"><h4>OR</h4></label>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
											<label class="login2 pull-right pull-right-pro"
												style="margin: 0px; padding: 10px 0px;">Enter
												Customer ID</label>
										</div>
										<div class="col-lg-2 col-md-2 col-sm-2 col-xs-12">
											<input type="number" class="form-control" id="customer_id"
												name="customer_id" />
										</div>
										<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
											<div class="cancel-wp pull-left form-bc-ele">
												<button class="btn btn-white" type="reset">Cancel</button>
												<button class="btn btn-sm btn-primary login-submit-cs"
													type="submit" onclick="getInfo()">Search</button>
											</div>
										</div>

									</div>

								</div>


								</br>

								<div class="sparkline8-list">
									<div class="sparkline8-hd">
										<div class="main-sparkline8-hd">
											<h1>Basic Table</h1>
										</div>
									</div>
									<div class="sparkline8-graph">
										<div class="static-table-list">
											<table class="table" id="table">
												<thead>
													<tr>
														<th>SSN ID</th>
														<th>Customer ID</th>
														<th>Name</th>
														<th>Address</th>
														<th>Age</th>
														<th>Status</th>
													</tr>
												</thead>
												<tbody id="tbody">

												</tbody>
											</table>
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

	<script type="text/javascript">
		function getInfo() {
			debugger;
			var ssn = '';
			var id = '';
			if (document.getElementById('customer_ssn').value != null) {
				ssn = document.getElementById('customer_ssn').value;
			}
			if (document.getElementById('customer_id').value != null) {
				id = document.getElementById('customer_id').value;
			}
			$.ajax({
				url : 'CustomerSearchController',
				data : {
					ssn : ssn,
					id : id
				},
				success : function(responseText) {
					var obj = JSON.parse(responseText);

					var trHTML = '';
					$.each(obj, function(i, item) {

						trHTML += '<tr><td>' + item.cust_ssn + '</td><td>'
								+ item.cust_id + '</td><td>' + item.cust_name
								+ '</td><td>' + item.cust_address + '</td><td>'
								+ item.cust_age + '</td><td>' + item.status
								+ '</td></tr>';
					});

					$('#table').append(trHTML);

				},
				//If there was no resonse from the server
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("Something really bad happened " + textStatus);
					$("#ajaxResponse").html(jqXHR.responseText);
				},
			});
		}
	</script>
</body>

</html>
