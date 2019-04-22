package fpt.java5.assignment.controller.record;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FindStaff {

	@GetMapping("/findStaff")
	public String showPage() {
		return "findStaff";
	}
}
