package fpt.java5.assignment.controller.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.service.staff.StaffService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DeleteS {

	@Autowired
	StaffService staffService;
	
	@GetMapping("deleteStaff/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public String deleteStaff(RedirectAttributes redirectAttributes,@PathVariable("id") int idStaff) {
		staffService.delete(idStaff);
		redirectAttributes.addFlashAttribute("msg","Delete Success Staff");
		return "redirect:/allStaff";
	}
}
