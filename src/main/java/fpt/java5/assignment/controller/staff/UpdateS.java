package fpt.java5.assignment.controller.staff;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class UpdateS {

	@Autowired
	StaffService staffService;

	@Autowired
	ServletContext servletContext;
	

	@PostMapping("updateStaff/{id}")
	public String updateStaff(Model model, @ModelAttribute("staffUpdate") Staff staffUpdate,
			@RequestParam("file-input") MultipartFile photo) {
		if (photo.isEmpty()) {

		} else {
			try {
				String photoPath = servletContext.getRealPath("/imageupload/") + photo.getOriginalFilename();
				photo.transferTo(new File(photoPath));
				System.out.println(photoPath);
				staffUpdate.setPhoto(photo.getOriginalFilename());
				staffService.save(staffUpdate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return "redirect:/allStaff";
	}
}
