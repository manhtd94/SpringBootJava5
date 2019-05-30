package fpt.java5.assignment.controller.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.entities.Record;
import fpt.java5.assignment.repository.record.RecordRepository;

@Controller
public class GetRecordById {
	
	@Autowired
	RecordRepository recordRepository;
	
	@GetMapping("editDetailRecord/{idRecord}")
	public String editRecord(Model model, 
			@PathVariable("idRecord") int idRecord,
			@ModelAttribute("editRecord") Record editRecord) {
		
		editRecord = recordRepository.findById(idRecord).get();
		model.addAttribute("recordDetail", editRecord);
		
		return "editDetailRecord";
	}
	
}
