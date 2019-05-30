package fpt.java5.assignment.controller.record;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.java5.assignment.entities.Record;
import fpt.java5.assignment.repository.record.RecordRepository;
import fpt.java5.assignment.service.record.TotalRecord;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class RecordController {

	@Autowired
	StaffService staffService;

	@Autowired
	TotalRecord totalRecord;

	@Autowired
	RecordRepository recordRepository;

	@GetMapping("/record/{id}")
	public String showPage(Model model, @PathVariable("id") int id, @ModelAttribute("newRecord") Record newRecord) {
		model.addAttribute("staffById", staffService.getStaffById(id));

		model.addAttribute("newRecord", new Record());

		return "record";
	}

	@PostMapping("/record/record")
	public String newRecord(Model model, @ModelAttribute("newRecord") Record newRecord,
			@RequestParam("staffId") int idStaff) {

		newRecord.setDateRecord(new Date());
		newRecord.setStaff(staffService.getStaffById(idStaff));

		totalRecord.save(newRecord);

		return "redirect:/recordDetail/" + idStaff;
	}

	@GetMapping("recordDetail/{id}")
	public String detailRecord(Model model, @PathVariable("id") int idStaff) {

		model.addAttribute("staffById", staffService.getStaffById(idStaff));

		List<Record> listRecordDetail = new ArrayList<>();
		listRecordDetail = recordRepository.findRecordByIdStaff(idStaff);
		model.addAttribute("listRecordDetail", listRecordDetail);

		return "recordDetail";
	}
}
