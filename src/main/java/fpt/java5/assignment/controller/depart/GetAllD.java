package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fpt.java5.assignment.service.depart.DepartService;

@Controller
public class GetAllD {
	
	@Autowired
	DepartService departService;
	
	@GetMapping({"/alldepartment"})
	public String showHome(Model model) {
		model.addAttribute("allDepartment", departService.findAll());
		return "alldepartment";
	}
}
