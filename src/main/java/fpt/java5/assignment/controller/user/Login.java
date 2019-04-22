package fpt.java5.assignment.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
	
	@GetMapping({"/","loginPage"})
	public String displayLogin() {
		return "user/loginPage";
	}
}
