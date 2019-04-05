package fpt.java5.assignment.controller.depart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateD {
	@GetMapping({"/createDepartment"})
	public String showHome() {
		
		return "createDepartment";
	}
}
