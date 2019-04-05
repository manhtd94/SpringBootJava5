package fpt.java5.assignment.controller.depart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetAllD {
	@GetMapping({"/alldepartment"})
	public String showHome() {
		
		return "alldepartment";
	}
}
