package fpt.java5.assignment.controller.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.service.depart.DepartService;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class GetByIdS {

	@Autowired
	StaffService staffService;

	@Autowired
	DepartService departService;

	@GetMapping("updateStaff/{id}")
	public String getById(Model model, @PathVariable("id") int idStaff,
			@ModelAttribute("staffUpdate") Staff staffUpdate) {
		staffUpdate = staffService.getStaffById(idStaff);
		model.addAttribute("staffUpdate", staffUpdate);
		System.out.println(staffUpdate.getPhoto());
		return "updateStaff";
	}

	@ModelAttribute("listDepart")
	public List<Department> getListDepart() {
		return departService.findAll();
	}
}
