package fpt.java5.assignment.controller.record;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fpt.java5.assignment.entities.Record;
import fpt.java5.assignment.repository.record.RecordRepository;

@Controller
public class UpdateRecord {

	@Autowired
	RecordRepository recordRepository;
	
	@PostMapping("editDetailRecord/{idRecord}")
	public String editRecord(Model model,
			@ModelAttribute("recordDetail") Record updateRecord) {
		
		updateRecord.setDateRecord(new Date());
		recordRepository.save(updateRecord);
		
		return "redirect:/recordDetail/" + updateRecord.getStaff().getId();
	}
	
}
