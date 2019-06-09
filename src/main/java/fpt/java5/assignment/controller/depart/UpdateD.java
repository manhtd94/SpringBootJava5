package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.service.depart.DepartService;

@Controller
public class UpdateD {
	
	@Autowired
	DepartService departService;
	
	@PostMapping("updateDepartment/{id}")
	public String saveEdit(RedirectAttributes redirectAttributes,
			@ModelAttribute("editDepartment") Department editDepartment) {
		
		departService.save(editDepartment);
		redirectAttributes.addFlashAttribute("msg", "Update Success");
		return "redirect:/alldepartment";
	}
}
