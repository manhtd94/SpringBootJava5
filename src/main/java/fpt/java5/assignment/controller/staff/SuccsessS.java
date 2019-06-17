package fpt.java5.assignment.controller.staff;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import fpt.java5.assignment.entities.Staff;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccsessS {

	@GetMapping("/createSuccsess")
	@PreAuthorize("hasRole('ADMIN')")
	public String createSuccsess(Model model, HttpSession session) {
//		Staff newStaff = (Staff) session.getAttribute("newStaff");
//		model.addAttribute("newStaff", newStaff);
		return "createSuccess";
	}
}
