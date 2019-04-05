package fpt.java5.assignment.controller.depart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpdateD {

	@GetMapping("/updateDepartment")
	public String showPage() {
		return "updateDepartment";
	}
}
