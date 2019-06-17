<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-header float-left">
			<div class="page-title">
				<h1>Create Success</h1>
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
					<div class="card-body card-block">
						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">ID Staff</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${newStaff.id}</p>
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Name</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${newStaff.name}</p>
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Gender</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${newStaff.gender == 1?'Male':'Female'}</p>
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Photo</label>
							</div>
							<div class="col-12 col-md-9">
								<img alt="" width="150" src="/imageupload/${newStaff.photo}">
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Email</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${newStaff.email}</p>
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Phone</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${newStaff.phone}</p>
							</div>
						</div>

						<div class="row form-group">
							<div class="col col-md-3">
								<label class=" form-control-label">Salary</label>
							</div>
							<div class="col-12 col-md-9">
								<p class="form-control-static">${newStaff.salary}</p>
							</div>
						</div>

						<div class="card-footer">
							<a href="home">Home</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>