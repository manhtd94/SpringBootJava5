<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-title">
			<h1>Department</h1>
		</div>
	</div>
</div>

<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="container">
						<form action="">
							<table class="table">
								<thead>
									<tr>
										<th>Id</th>
										<th>Name</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${allDepartment}" var="depart">
										<tr>
											<td>${depart.id}</td>
											<td>${depart.name}</td>
											<td><a href="updateDepartment/${depart.id}"><img
													alt="Edit"
													src="${pageContext.request.contextPath}/images/edit.png">
											</a> <a href="delete/${depart.id}"> <img
													alt="delete/${depart.id}"
													src="${pageContext.request.contextPath}/images/delete.png">
											</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</form>
						<nav aria-label="Page navigation example">
							<ul class="pagination pg-blue">
								<li class="page-item"><a class="page-link">Previous</a></li>
								<c:forEach var="number" items="${numberPagination}">
								<li class="page-item"><a class="page-link" href="alldepartment?page=${number}">${number}</a></li>
								</c:forEach>
								<li class="page-item"><a class="page-link">Next</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>


		</div>
	</div>
	<!-- .animated -->
</div>
<!-- .content -->