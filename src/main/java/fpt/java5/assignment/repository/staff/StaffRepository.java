package fpt.java5.assignment.repository.staff;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fpt.java5.assignment.entities.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
	
	List<Staff> findByNameLike(String name);
	
}
