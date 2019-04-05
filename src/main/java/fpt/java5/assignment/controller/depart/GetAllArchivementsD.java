package fpt.java5.assignment.controller.depart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetAllArchivementsD {

	@GetMapping("/achiveDepartment")
	public String showPage() {
		return "achiveDepartment";
	}
}
