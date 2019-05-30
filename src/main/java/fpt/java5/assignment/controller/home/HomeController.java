package fpt.java5.assignment.controller.home;

import org.jetbrains.annotations.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fpt.java5.assignment.service.record.TotalRecord;

@Controller
public class HomeController {
	
	private TotalRecord totalRecord;

	@Contract(pure = true)
	@Autowired
	public HomeController(TotalRecord totalRecord){
		this.totalRecord = totalRecord;
	}
	
	@GetMapping(value = {"/home"})
	public String showHome(Model model) {
		model.addAttribute("list10", totalRecord.get10StaffMostAchevment(12));
		return "home";
	}
	
}
