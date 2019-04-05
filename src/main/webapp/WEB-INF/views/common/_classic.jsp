<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta name="description" content="Sufee Admin - HTML5 Admin Template">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="apple-icon.png">
<link rel="shortcut icon" href="favicon.ico">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/themify-icons/css/themify-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/selectFX/css/cs-skin-elastic.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/jqvmap/dist/jqvmap.min.css">


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/style.css">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>

<script
	src="${pageContext.request.contextPath}/vendors/jquery/dist/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/vendors/popper.js/dist/umd/popper.min.js"></script>
<script
	src="${pageContext.request.contextPath}/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
<script
	src="${pageContext.request.contextPath}/vendors/chart.js/dist/Chart.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/dashboard.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/widgets.js"></script>
<script
	src="${pageContext.request.contextPath}/vendors/jqvmap/dist/jquery.vmap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
<script
	src="${pageContext.request.contextPath}/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
</head>


<body>

	<tiles:insertAttribute name="menu" />

	<section>
		<div class="content">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
			<tiles:insertAttribute name="body" />
		</div>
	</section>

	<footer>

		<tiles:insertAttribute name="footer" />
	</footer>

</body>
</html>