package fpt.java5.assignment.controller.depart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.service.depart.DepartService;

@Controller
public class GetByIdD {
	
	@Autowired
	DepartService departService;
	
	@GetMapping("/updateDepartment/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public String showPage(Model model,
			@PathVariable("id") int id,
			@ModelAttribute("editDepartment") Department editDepartment) {
		
		editDepartment = departService.getDepartmentById(id);
		model.addAttribute("editDepartment", editDepartment);
		
		return "updateDepartment";
	}
	
	
	
}
