package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.service.depart.DepartService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DeleteD {

	@Autowired
	DepartService departmentService;
	
	@GetMapping("delete/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public String deleteDepartment(RedirectAttributes redirectAttributes,@PathVariable("id") int idDepartment) {
		departmentService.delete(idDepartment);
		redirectAttributes.addFlashAttribute("msg","Delete success");
		return "redirect:/alldepartment";
	}
}
