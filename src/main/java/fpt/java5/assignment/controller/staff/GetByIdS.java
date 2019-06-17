package fpt.java5.assignment.controller.staff;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

import javax.servlet.http.HttpSession;

@Controller
public class GetByIdS {

	@Autowired
	StaffService staffService;

	@Autowired
	DepartService departService;
	
	@Autowired
	RoleRepository roleRepository;

	@GetMapping("updateStaff/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public String getById(Model model, HttpSession session,
						  @PathVariable("id") int idStaff,
							@ModelAttribute("staffUpdate") Staff staffUpdate) {
		
		staffUpdate = staffService.getStaffById(idStaff);
		
		//Get role of a staff
		Set<Role> allRoleOfStaff = new HashSet<>();
		allRoleOfStaff = staffUpdate.getRoles();
		for(Role allll : allRoleOfStaff) {
			System.out.println(allll.getName());
		}
		session.setAttribute("roleOfStaff", allRoleOfStaff);

		model.addAttribute("staffUpdate", staffUpdate);

		List<Role> getAllRoles = (List<Role>)roleRepository.findAll();
		session.setAttribute("listRole",getAllRoles);
		//model.addAttribute("listRole",getAllRoles);
		return "updateStaff";
	}

	@ModelAttribute("listDepart")
	public List<Department> getListDepart() {
		return departService.findAll();
	}
	
//	@ModelAttribute("listRole")
//	public List<Role> getAllRole(){
//		return (List<Role>)roleRepository.findAll();
//	}
}
