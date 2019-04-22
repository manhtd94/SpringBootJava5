<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-title">
			<h1>Total Achievement of Staff</h1>
		</div>
	</div>
</div>

<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row">
			<div class="col-md-12">
				<div class="card">

					<div class="container">
						<table class="table">
							<thead>
								<tr>
									<th>ID</th>
									<th>Name</th>
									<th>Total Achievement</th>
									<th>Total Discipline</th>
									<th>General</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${totalStaff}" var="totalStaff">
									<tr>
										<td>${totalStaff[0]}</td>
										<td>${totalStaff[1]}</td>
										<td>${totalStaff[2]}</td>
										<td>${totalStaff[3]}</td>
										<td>${totalStaff[2] - totalStaff[3]}</td>
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