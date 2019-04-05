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
					<li><a href="#">Dashboard</a></li>
					<li><a href="#">Forms</a></li>
					<li class="active">Basic</li>
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
						<strong>Create Record</strong>
					</div>
					<div class="card-body card-block">
						<form action="" method="post" enctype="multipart/form-data"
							class="form-horizontal">
							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">Id staff</label>
								</div>
								<div class="col-12 col-md-9">
									<p class="form-control-static">Id</p>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">Name</label>
								</div>
								<div class="col-12 col-md-9">
									<p class="form-control-static">Name</p>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">Department</label>
								</div>
								<div class="col-12 col-md-9">
									<p class="form-control-static">Depart</p>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label class=" form-control-label">Kind</label>
								</div>
								<div class="col col-md-9">
									<div class="form-check">
										<div class="radio">
											<label for="radio1" class="form-check-label "> <input
												type="radio" id="radio1" name="radios" value="option1"
												class="form-check-input">Achievement
											</label>
										</div>
										<div class="radio">
											<label for="radio2" class="form-check-label "> <input
												type="radio" id="radio2" name="radios" value="option2"
												class="form-check-input">Discipline
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
									<textarea name="textarea-input" id="textarea-input" rows="9"
										placeholder="Content..." class="form-control"></textarea>
								</div>
							</div>

							<div class="row form-group">
								<div class="col col-md-3">
									<label for="text-input" class=" form-control-label">Date</label>
								</div>
								<div class="col-12 col-md-9">
									<input type="date" id="text-input" name="text-input"
										placeholder="Text" class="form-control"><small
										class="form-text text-muted">This is a help text</small>
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
						</form>
					</div>

				</div>
			</div>
		</div>

	</div>
</div>