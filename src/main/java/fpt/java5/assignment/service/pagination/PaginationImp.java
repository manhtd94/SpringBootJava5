package fpt.java5.assignment.service.pagination;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.pagination.DepartmentPaginationRepository;
import fpt.java5.assignment.repository.pagination.StaffPaginationRepository;

@Service
public class PaginationImp implements Pagination {
	
	@Autowired
	DepartmentPaginationRepository departPagination;
	
	@Autowired
	StaffPaginationRepository staffPagination;

	@Override
	public List<Integer> numberPagination(int number, int size) {
		List<Integer> listNumber = new ArrayList<>();
		
		if(size % number == 0) {
			number = size / number;
		}else {
			number = (size / number) + 1;
		}
		for (int i = 1; i <= number; i++) {
			listNumber.add(i);
		}
		return listNumber;
	}

	@Override
	public List<Department> listDepartmentInPage(Pageable pageable) {
		return departPagination.findDepartments(pageable);
	}

	@Override
	public List<Staff> listStaffInPage(Pageable pageable) {
		return staffPagination.findStaffs(pageable);
	}

}
