<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<meta name="description" content="">
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
</head>
<body>

<div class="error-pagewrap">
		<div class="error-page-int">
			<div class="text-center custom-login">
				<h3>Retail Bank</h3>
				<p>Register</p>
			</div>
			<div class="content-error">
				<div class="hpanel">
                    <div class="panel-body">
                        <form action="RegisterController" id="loginForm" method="post">
                            <div class="row">
                                <div class="form-group col-lg-12">
                                    <label>Username</label>
                                    <input type="text" class="form-control" pattern="([a-zA-Z0-9]){8,}" name="email" placeholder="Username">
                                    <span class="help-block small">Your unique username to app(username can be alphabetic or alphanumeric and should have a minimum of 8 characters)</span>
                                </div>
                                <div class="form-group col-lg-6">
                                    <label>Password</label>
                                    <input type="password" id="pass" placeholder="******" pattern="(^(?=.{10,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\W).*$)" name="pass" class="form-control">
                                </div>
                                <div class="form-group col-lg-6">
                                    <label>Repeat Password</label>
                                    <input type="password" id="cpass" placeholder="******" pattern="(^(?=.{10,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\W).*$)" name="cpass" class="form-control">
                                </div>
                                <div class="checkbox col-lg-12">
                                    <span class="help-block small">Your strong password(It should contain 10 characters including one special character, one upper case, one numeric)</span>
                                </div>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-success loginbtn">Register</button>
                                <button type="reset" class="btn btn-default">Cancel</button>
                            </div>
                        </form>
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