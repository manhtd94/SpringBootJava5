package fpt.java5.assignment.repository.staff;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import fpt.java5.assignment.entities.Staff;

public interface StaffRepository extends CrudRepository<Staff, Integer> {
	
	List<Staff> findByNameLike(String name);
	
	Staff findByUserName(String userName);
	
    @Query("SELECT DISTINCT staff FROM Staff staff left join fetch staff.record WHERE staff.name LIKE :name%")
    @Transactional(readOnly = true)
    List<Staff> findByLastName(@Param("name") String name);
	
	
}
