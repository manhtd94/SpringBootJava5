<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<base href="${pageContext.servletContext.contextPath}/editDetailRecord">


<div class="content mt-3">
	<div class="animated fadeIn">
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<strong>Edit Record</strong>
					</div>
					<div class="card-body card-block">
						<form:form action="" method="post"
							enctype="multipart/form-data" class="form-horizontal"
							modelAttribute="recordDetail">
							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">ID</label>
								</div>
								<div class="col-12 col-md-9">
									<p class="form-control-static">${recordDetail.id}</p>
									<form:hidden path="id" />
									<form:hidden path="staff.id"/>
									
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Type</label>
								</div>
								<div class="col-12 col-md-9">
									<form:radiobutton path="type" value="1" name="type" /> Arche
									<form:radiobutton path="type" value="0" name="type"/> Bri
									<small class="form-text text-muted"></small>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Reason</label>
								</div>
								<div class="col-12 col-md-9">
									<form:input id="text-input" name="text-input"
										class="form-control" path="reason" />
									<small class="form-text text-muted"></small>
								</div>
							</div>

							<div class="card-footer">
								<button type="submit" class="btn btn-primary btn-sm">
									<i class="fa fa-dot-circle-o"></i> Edit
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