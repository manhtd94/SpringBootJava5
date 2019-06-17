package fpt.java5.assignment.controller.staff;

import org.springframework.web.bind.annotation.GetMapping;

public class UpdateS {

	@GetMapping({"/updateStaff"})
	public String showPage() {
		return "updateStaff";
	}
}