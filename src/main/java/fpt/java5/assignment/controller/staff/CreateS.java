package fpt.java5.assignment.controller.staff;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateS {
	@GetMapping({"/createStaff"})
	public String showHome() {
		
		return "createStaff";
	}
}
