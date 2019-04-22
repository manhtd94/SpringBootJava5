package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fpt.java5.assignment.service.record.TotalRecord;

@Controller
public class GetAllArchivementsD {

	@Autowired
	TotalRecord totalStaff;
	
	@GetMapping("/achiveDepartment")
	public String showPage(Model model) {
		model.addAttribute("totalDepart", totalStaff.getAllRecordOfDepartment());
		return "achiveDepartment";
	}
}
