<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style type="text/css">
*[id$=errors] {
	color: red;
	font-style: italic;
}
</style>

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
				<ol class="breadcrumb text-right">

				</ol>
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
						<strong>Create new Staff</strong>
					</div>
					<div class="card-body card-block">
						<form:form action="createStaff" method="post"
							enctype="multipart/form-data" class="form-horizontal"
							modelAttribute="newStaff">
							<!-- <div class="row form-group">
                                        <div class="col col-md-3"><label class=" form-control-label">Static</label>
                                        </div>
                                        <div class="col-12 col-md-9">
                                            <p class="form-control-static">Username</p>
                                        </div>
                                    </div> -->
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Full
										Name</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="name" type="text" id="text-input"
										name="text-input" placeholder="Text" class="form-control" />
									<small class="form-text text-muted"> <form:errors
											path="name"></form:errors>
									</small>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Department</label>
								</div>
								<div class="col-12 col-md-9">
									<form:select path="department.id" name="select" id="select"
										class="form-control">
										<form:options items="${listDepart}" itemLabel="name"
											itemValue="id" />
									</form:select>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">Gender</label>
								</div>
								<div class="col col-md-9">
									<div class="form-check">
										<div class="radio">
											<label for="radio1" class="form-check-label "> <form:radiobutton
													path="gender" value="1" id="radio1" name="radios"
													class="form-check-input"
													checked="${gender == 1?'checked':''}" />Male
											</label>
										</div>
										<div class="radio">
											<label for="radio2" class="form-check-label "> <form:radiobutton
													path="gender" value="0" id="radio2" name="radios"
													class="form-check-input"
													checked="${gender == 0?'checked':''}" />Female
											</label>
										</div>
									</div>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="file-input" class=" form-control-label">Choose
										picture</label>
								</div>
								<div class="col-12 col-md-9">
									<input type="file" id="file-input" name="file-input"
										class="form-control-file">
									<p style="font-style: italic;color: red">${errorImage}</p>
									
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Birth
										Day</label>
								</div>
								<div class="col-12 col-md-9">
									<input type="date" id="text-input" name="birth"
										placeholder="Text" class="form-control" /> <small
										class="form-text text-muted"><form:errors path="birth"/>
									</small>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Salary</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input path="salary" type="number" id="text-input"
										name="text-input" placeholder="0" class="form-control" />
									<small class="form-text text-muted"> <form:errors
											path="salary"></form:errors>
									</small>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="email-input" class=" form-control-label">Email</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input type="email" path="email" id="email-input"
										name="email-input" placeholder="Enter Email"
										class="form-control" />
									<small class="help-block form-text"><form:errors
											path="email"></form:errors></small>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Phone</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input type="number" path="phone" id="text-input"
										name="text-input" placeholder="Text" class="form-control" />
									<small class="form-text text-muted"> <form:errors
											path="phone"></form:errors>
									</small>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="textarea-input" class=" form-control-label">Note</label>
								</div>
								<div class="col-12 col-md-9">
									<form:textarea path="note" name="textarea-input"
										id="textarea-input" rows="9" placeholder="Content..."
										class="form-control" />
									<small class="form-text text-muted"> <form:errors
											path="note"></form:errors>
									</small>
								</div>
							</div>

							<div class="card-footer">
								<button type="submit" class="btn btn-primary btn-sm">
									<i class="fa fa-dot-circle-o"></i> Send
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