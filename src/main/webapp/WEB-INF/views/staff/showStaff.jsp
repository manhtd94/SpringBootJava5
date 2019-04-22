<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-title">
			<h1>All Staffs</h1>
		</div>
	</div>
</div>

<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row">
			<div class="col-md-12">
				<div class="card">

					<div class="container">
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
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listStaffs}" var="staff">
									<tr>
										<td>${staff.id}</td>
										<td>${staff.name}</td>
										<td>${staff.department.name}</td>
										<td>${staff.gender == 0?'Female':'Male'}</td>
										<td>
											<img alt="" src="/imageupload/${staff.photo}"
												style="width: 50px; height: 50px;"
											>
										</td>
										<td>${staff.birth}</td>
										<td>${staff.salary}</td>
										<td>${staff.email}</td>
										<td>${staff.phone}</td>
										<td>${staff.note}</td>
										<td>
											<a href="updateStaff/${staff.id}"><img alt="Edit"
												src="${pageContext.request.contextPath}/images/edit.png">
											</a> 
												
											<a href="deleteStaff/${staff.id}">
													<img alt="delete" src="${pageContext.request.contextPath}/images/delete.png">
											</a>
										
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>


		</div>
	</div>
	<!-- .animated -->
</div>
<!-- .content -->
