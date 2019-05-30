package fpt.java5.assignment.repository.record;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
	
	
	@Query("SELECT r FROM Record r where r.staff.id = :idStaff")
	@Transactional
	List<Record> findRecordByIdStaff(@Param("idStaff") int idStaff);
	
	@Query("SELECT DISTINCT r.staff.id FROM Record r where r.id = :id")
	int findIdStaffByRecord(@Param("id") int id);
	
	

}
