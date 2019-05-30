<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table" style="font-size: 14px;">
		<thead>
			<tr>
				<th>ID</th>
				<th>Full Name</th>
				<th>Department</th>
				<th>Gender</th>
				<th>Picture</th>
				<th>Birth</th>
				<th>Salary</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Note</th>
				<th>UserName</th>
				<th>Password</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td>${newStaff.id}</td>
					<td>${newStaff.name}</td>
					<td>${newStaff.department.name}</td>
					<td>${newStaff.gender == 0?'Female':'Male'}</td>
					<td><img alt="" src="/imageupload/${newStaff.photo}"
						style="width: 50px; height: 50px;"></td>
					<td>${newStaff.birth}</td>
					<td>${newStaff.salary}</td>
					<td>${newStaff.email}</td>
					<td>${newStaff.phone}</td>
					<td>${newStaff.note}</td>
					<td>${newStaff.userName}</td>
					<td>${newStaff.password}</td>
					<td><a href="updateStaff/${staff.id}"><img alt="Edit"
							src="${pageContext.request.contextPath}/images/edit.png"> </a>

						<a href="deleteStaff/${staff.id}"> <img alt="delete"
							src="${pageContext.request.contextPath}/images/delete.png">
					</a></td>
				</tr>
		</tbody>
	</table>
</body>
</html>