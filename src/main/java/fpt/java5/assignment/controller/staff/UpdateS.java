package fpt.java5.assignment.controller.staff;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fpt.java5.assignment.entities.Role;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.role.RoleRepository;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class UpdateS {

	@Autowired
	StaffService staffService;

	@Autowired
	ServletContext servletContext;
	
	@Autowired
	RoleRepository roleRepository;

	@PostMapping("/updateStaff/{id}")
	public String updateStaff(Model model, @ModelAttribute("staffUpdate") Staff staffUpdate,
			@RequestParam("file-input") MultipartFile photo, @RequestParam("imageName") String imageName,
			@RequestParam("boxRole") String[] role) {
		if (photo.isEmpty()) {
			staffUpdate.setPhoto(imageName);
		} else {
			try {
				String photoPath = servletContext.getRealPath("/imageupload/") + photo.getOriginalFilename();
				photo.transferTo(new File(photoPath));
				staffUpdate.setPhoto(photo.getOriginalFilename());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		Set<Role> roles = new HashSet<>();
		for(String roless : role) {
			roles.add(roleRepository.findByName(roless));
		}
		staffUpdate.setRoles(roles);
		staffService.save(staffUpdate);

		return "redirect:/allStaff";
	}
}
