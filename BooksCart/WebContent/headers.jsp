<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
	
<body>
<nav class="cyan">
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">&nbsp;&nbsp;TheBookies</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a href="index.jsp">Home</a></li>
        <li>
			<a href="viewCart.AppController"><i class="large material-icons left">shopping_cart</i>(${requestScope.cartCount})</a>
		</li>
      </ul>
    </div>
  </nav>
</body>
