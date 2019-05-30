<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<base href="${pageContext.servletContext.contextPath}/recordDetail">


<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-header float-left">
			<div class="page-title">
				<h1>Detail Record</h1>
			</div>
		</div>
	</div>
	<div class="col-sm-8">
		<div class="page-header float-right">
			<div class="page-title"></div>
		</div>
	</div>
</div>

<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<strong>Information</strong>
					</div>
					<div class="card-body card-block">

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Id staff</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${staffById.id}</p>
								<input type="hidden" name="staffId" value="${staffById.id}" />
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Name</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${staffById.name}</p>
							</div>
						</div>
						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Department</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${staffById.department.name}</p>
							</div>
						</div>



						<div class="card-header">
							<strong> <a href="record/${staffById.id}"> <img
									alt="Detail"
									src="${pageContext.request.contextPath}/images/add.png">
									Add new Record
							</a>
							</strong>

						</div>

						<table class="table">
							<thead>
								<tr>
									<th>Id</th>
									<th>Type</th>
									<th>Reason</th>
									<th>Date</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listRecordDetail}" var="record">
									<tr>
										<td>${record.id}</td>
										<td>${record.type == 1?'Archivment' : 'Discipline'}</td>
										<td>${record.reason}</td>
										<td>${record.dateRecord}</td>
										<td><a href="editDetailRecord/${record.id}"> <img
												alt="Edit" onclick="return confirm('Are you sure?')"
												src="${pageContext.request.contextPath}/images/edit.png">
										</a> <a href="deleteDetailRecord/${record.id}"> <img
												alt="delete/${record.id}"
												onclick="return confirm('Are you sure?')"
												src="${pageContext.request.contextPath}/images/delete.png">
										</a></td>
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