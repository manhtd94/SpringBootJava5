package fpt.java5.assignment.repository.record;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fpt.java5.assignment.entities.Record;

@org.springframework.stereotype.Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {

	@Query("SELECT r.staff.id,"
			+ "r.staff.name, "
			+ "SUM(case when r.type=1 then 1 else 0 end),"
			+ "SUM(case when r.type=0 then 1 else 0 end)"
			+ " FROM Record r "
			+ " GROUP BY r.staff.id")
	List<Object[]> findAllTotalAchieveOfStaff();

	@Query("SELECT r.staff.department.id,"
			+ "r.staff.department.name, "
			+ "SUM(case when r.type=1 then 1 else 0 end),"
			+ "SUM(case when r.type=0 then 1 else 0 end)"
			+ " FROM Record r "
			+ " GROUP BY r.staff.department.id")
	List<Object[]> findTotalAchieveOfDepartment();
	
	

}
