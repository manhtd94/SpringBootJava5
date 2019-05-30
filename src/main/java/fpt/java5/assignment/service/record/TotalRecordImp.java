package fpt.java5.assignment.service.record;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.java5.assignment.entities.Record;
import fpt.java5.assignment.repository.record.Find10Repository;
import fpt.java5.assignment.repository.record.RecordRepository;

@Service
public class TotalRecordImp implements TotalRecord {

	@Autowired
	RecordRepository recordRepository;
	
	@Autowired
	Find10Repository find10;
	
	@Override
	public List<Object[]> getAllRecordOfStaff() {
		return recordRepository.findAllTotalAchieveOfStaff();
	}

	@Override
	public List<Object[]> getAllRecordOfDepartment() {
		return recordRepository.findTotalAchieveOfDepartment();
	}

	@Override
	public Record save(Record newRecord) {
		return recordRepository.save(newRecord);
	}

	@Override
	public List<Object[]> get10StaffMostAchevment(int limit) {
		return find10.find10Staff(limit);
	}

}
