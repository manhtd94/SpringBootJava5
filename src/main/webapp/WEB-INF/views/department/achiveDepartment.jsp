<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-title">
			<h1>Total Achievement of Department</h1>
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
									<th>Department</th>
									<th>Total Achievement</th>
									<th>Total Discipline</th>
									<th>General</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${totalDepart}" var="totalDepart">
									<tr>
										<td>${totalDepart[0]}</td>
										<td>${totalDepart[1]}</td>
										<td>${totalDepart[2]}</td>
										<td>${totalDepart[3]}</td>
										<td>${totalDepart[2] - totalDepart[3]}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>


	</div>
</div>
<!-- .animated -->