package fpt.java5.assignment.controller.record;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.staff.StaffRepository;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class SearchResult {

	@Autowired
	StaffService staffService;

	@Autowired
	StaffRepository staffRepository;

	@GetMapping("/searchResult")
	public String searchResult(Model model, 
			@RequestParam("name") String name) {
//				model.addAttribute("listStaffByName", staffService.findStaffByName(name));

		List<Staff> results = staffRepository.findByLastName(name);
		if (results.isEmpty()) {
			model.addAttribute("notFound", "not found");
			return "findStaff";
		} else if (results.size() == 1) {
			Staff staff = new Staff();
			staff = results.iterator().next();
			return "redirect:recordDetail/" + staff.getId();
		} else {
			model.addAttribute("listStaffByName", results);
			return "searchResult";
		}
	}
}
