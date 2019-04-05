package fpt.java5.assignment.controller.record;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecordController {

	@GetMapping("/record")
	public String showPage() {
		return "record";
	}
}
