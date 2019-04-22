package fpt.java5.assignment.controller.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class DeleteS {
	@Autowired
	StaffService staffService;
	
	@GetMapping("deleteStaff/{id}")
	public String deleteStaff(@PathVariable("id") int idStaff) {
		staffService.delete(idStaff);
		return "redirect:/allStaff";
	}
}
