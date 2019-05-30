package fpt.java5.assignment.repository.pagination;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import fpt.java5.assignment.entities.Staff;

public interface StaffPaginationRepository extends PagingAndSortingRepository<Staff, Integer> {
	
	@Query("SELECT s from Staff s")
	List<Staff> findStaffs(Pageable pageable);

}
