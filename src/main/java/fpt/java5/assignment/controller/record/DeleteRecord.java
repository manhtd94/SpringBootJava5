package fpt.java5.assignment.controller.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.repository.record.RecordRepository;

@Controller
public class DeleteRecord {

	@Autowired
	RecordRepository recordRepository;
	
	@GetMapping("deleteDetailRecord/{id}")
	public String deleteRecordDetail(@PathVariable("id") int id) {
		int idStaff = recordRepository.findIdStaffByRecord(id);
		recordRepository.deleteById(id);
		return "redirect:/recordDetail/" + idStaff;
	}
	 
}
