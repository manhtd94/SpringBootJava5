package fpt.java5.assignment.service.record;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.java5.assignment.entities.Record;
import fpt.java5.assignment.repository.record.RecordRepository;

@Service
public class TotalRecordImp implements TotalRecord {

	@Autowired
	RecordRepository recordRepository;
	
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

}
