package fpt.java5.assignment.controller.record;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class SearchResult {
	
	@Autowired
	StaffService staffService;

	@GetMapping("/searchResult")
	public String searchResult(Model model, @RequestParam("name") String name) {
		model.addAttribute("listStaffByName", staffService.findStaffByName(name));
		return "searchResult";
	}
}
