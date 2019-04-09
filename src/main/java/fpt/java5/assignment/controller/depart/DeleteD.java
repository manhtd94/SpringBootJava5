package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.service.depart.DepartService;

@Controller
public class DeleteD {

	@Autowired
	DepartService departmentService;
	
	@GetMapping("delete/{id}")
	public String deleteDepartment(@PathVariable("id") int idDepartment) {
		departmentService.delete(idDepartment);
		return "redirect:/alldepartment";
	}
}
