<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="breadcrumbs">
	<div class="col-sm-4">
		<div class="page-header float-left">
			<div class="page-title">
				<h1>Dashboard</h1>
			</div>
		</div>
	</div>
	<div class="col-sm-8">
		<div class="page-header float-right">
			<div class="page-title">
			</div>
		</div>
	</div>
</div>

<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<strong>Create Record</strong>
					</div>
					<div class="card-body card-block">
						<form:form action="record" modelAttribute="newRecord" method="post"
							class="form-horizontal">
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

							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">Kind</label>
								</div>
								<div class="col col-md-9">
									<div class="form-check">
										<div class="radio">
											<label for="radio1" class="form-check-label "> 
											<form:radiobutton path="type"
												 id="radio1" name="radios" value="1"
												class="form-check-input" />Achievement
											</label>
										</div>
										<div class="radio">
											<label for="radio2" class="form-check-label "> 
											<form:radiobutton path="type"
												 id="radio2" name="radios" value="0"
												class="form-check-input" />Discipline
											</label>
										</div>
									</div>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="textarea-input" class=" form-control-label">Note</label>
								</div>
								<div class="col-12 col-md-9">
									<form:textarea path="reason" name="textarea-input" id="textarea-input" rows="9"
										placeholder="Content..." class="form-control" />
								</div>
							</div>

							<div class="card-footer">
								<button type="submit" class="btn btn-primary btn-sm">
									<i class="fa fa-dot-circle-o"></i> Save
								</button>
								<button type="reset" class="btn btn-danger btn-sm">
									<i class="fa fa-ban"></i> Reset
								</button>
							</div>
						</form:form>
					</div>

				</div>
			</div>
		</div>

	</div>
</div>