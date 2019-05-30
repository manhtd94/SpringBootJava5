package fpt.java5.assignment.controller.staff;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.entities.Role;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.role.RoleRepository;
import fpt.java5.assignment.service.depart.DepartService;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class GetByIdS {

	@Autowired
	StaffService staffService;

	@Autowired
	DepartService departService;
	
	@Autowired
	RoleRepository roleRepository;

	@GetMapping("updateStaff/{id}")
	public String getById(Model model, @PathVariable("id") int idStaff,
			@ModelAttribute("staffUpdate") Staff staffUpdate) {
		
		staffUpdate = staffService.getStaffById(idStaff);
		
		//Get role of a staff
		Set<Role> allRole = new HashSet<>();
		allRole = staffUpdate.getRoles();
		for(Role allll : allRole) {
			System.out.println(allll.getName());
		}
		model.addAttribute("roleOfStaff", allRole);

		model.addAttribute("staffUpdate", staffUpdate);
		return "updateStaff";
	}

	@ModelAttribute("listDepart")
	public List<Department> getListDepart() {
		return departService.findAll();
	}
	
	@ModelAttribute("listRole")
	public List<Role> getAllRole(){
		return (List<Role>)roleRepository.findAll();
	}
}
