package fpt.java5.assignment.repository.pagination;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import fpt.java5.assignment.entities.Department;

public interface DepartmentPaginationRepository extends PagingAndSortingRepository<Department, Integer> {

	@Query("SELECT d from Department d")
	List<Department> findDepartments(Pageable pageable);
	
}
