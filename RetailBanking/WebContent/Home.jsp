<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="">
<title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Google Fonts
		============================================ -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
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
                                                    <li class="nav-item"><a href="Home.jsp" class="nav-link">Home</a>
                                                    </li>
                                                    <li class="nav-item dropdown res-dis-nn">
                                                        <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">Customer Management <span class="angle-down-topmenu"><i class="fa fa-angle-down"></i></span></a>
                                                        <div role="menu" class="dropdown-menu animated zoomIn">
                                                            <a href="CreateCustomer.jsp" class="dropdown-item">Create Customer</a>
                                                            <a href="UpdateCustomer.jsp" class="dropdown-item">Update Customer</a>
                                                            <a href="DeleteCustomer.jsp" class="dropdown-item">Delete Customer</a>
                                                            <a href="CustomerStatus.jsp" class="dropdown-item">Customer Status</a>
                                                        </div>
                                                    </li>
                                                    <li class="nav-item dropdown res-dis-nn">
                                                        <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">Account Management <span class="angle-down-topmenu"><i class="fa fa-angle-down"></i></span></a>
                                                        <div role="menu" class="dropdown-menu animated zoomIn">
                                                            <a href="CreateAccount.jsp" class="dropdown-item">Create Account</a>
                                                            <a href="DeleteAccount.jsp" class="dropdown-item">Delete Account</a>
                                                            <a href="AccountStatus.jsp" class="dropdown-item">Account Status</a>
                                                        </div>
                                                    </li>
                                                    <li class="nav-item dropdown res-dis-nn">
                                                        <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">Status Details <span class="angle-down-topmenu"><i class="fa fa-angle-down"></i></span></a>
                                                        <div role="menu" class="dropdown-menu animated zoomIn">
                                                            <a href="CustomerSearch.jsp" class="dropdown-item">Customer Search</a>
                                                            <a href="AccountSearch.jsp" class="dropdown-item">Account Search</a>
                                                        </div>
                                                    </li>
                                                    <li class="nav-item"><a href="AccountStatement.jsp" class="nav-link">Print Account Statement</a>
                                                    </li>
                                                    <li class="nav-item"><a href="Logout.jsp" class="nav-link">Logout</a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="breadcome-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="breadcome-list">
                                    <div class="row">
                                    <center><h1>Welcome To Retail Bank</h1></center>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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

    <!-- jquery
		============================================ -->
    <script src="js/jquery-1.12.4.min.js"></script>
    <!-- bootstrap JS
		============================================ -->
    <script src="js/bootstrap.min.js"></script>
</body>

</html>