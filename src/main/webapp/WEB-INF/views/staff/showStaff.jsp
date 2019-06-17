<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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

                <c:if test="${not empty msg}">
                    <div class="col-sm-12">
                        <div class="alert  alert-success alert-dismissible fade show"
                             role="alert">
                            <span class="badge badge-pill badge-success">Sucess</span> ${msg}
                            <!-- <button type="button" class="close" data-dismiss="alert"
                                aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button> -->
                        </div>
                    </div>
                </c:if>

                <div class="card">
                    <div class="container">
                        <table id="bootstrap-data-table-export" class="table table-striped table-bordered"
                               style="font-size: 14px;">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
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
                                            <img alt="delete"
                                                 src="${pageContext.request.contextPath}/images/delete.png">
                                        </a>

                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <nav aria-label="Page navigation example">
                            <ul class="pagination pg-blue">
                                <li class="page-item"><a class="page-link">Previous</a></li>
                                <c:forEach var="number" items="${numberPagination}">
                                    <li class="page-item"><a class="page-link"
                                                             href="allStaff?page=${number}">${number}</a></li>
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
