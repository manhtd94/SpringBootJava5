package fpt.java5.assignment.service.pagination;

import java.util.List;

import org.springframework.data.domain.Pageable;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.entities.Staff;

public interface Pagination {

	List<Integer> numberPagination(int number, int size);

	List<Department> listDepartmentInPage(Pageable pageable);
	
	List<Staff> listStaffInPage(Pageable pageable);
	
}
