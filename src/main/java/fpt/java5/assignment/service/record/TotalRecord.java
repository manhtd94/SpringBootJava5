package fpt.java5.assignment.service.record;

import java.util.List;

import fpt.java5.assignment.entities.Record;

public interface TotalRecord {
	
	List<Object[]> getAllRecordOfStaff();
	
	List<Object[]> getAllRecordOfDepartment();
	
	List<Object[]> get10StaffMostAchevment(int limit);
	
	Record save(Record newRecord);
	
}
