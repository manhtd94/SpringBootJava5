package fpt.java5.assignment.service.record;

import java.util.List;

import fpt.java5.assignment.entities.Record;

public interface TotalRecord {
	
	List<Object[]> getAllRecordOfStaff();
	
	List<Object[]> getAllRecordOfDepartment();
	
	Record save(Record newRecord);
	
}
