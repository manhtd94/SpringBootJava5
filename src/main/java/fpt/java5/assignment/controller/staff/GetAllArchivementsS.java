package fpt.java5.assignment.controller.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fpt.java5.assignment.service.record.TotalRecord;

@Controller
public class GetAllArchivementsS {
	
	@Autowired
	TotalRecord totalStaff;
	
	@GetMapping("/achiveStaff")
	public String showPage(Model model) {
		model.addAttribute("totalStaff", totalStaff.getAllRecordOfStaff());
		return "achiveStaff";
	}
}
