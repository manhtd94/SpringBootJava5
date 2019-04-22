package fpt.java5.assignment.controller.staff;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.service.depart.DepartService;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class CreateS {

	@Autowired
	DepartService departService;

	@Autowired
	StaffService staffService;

	@Autowired
	ServletContext servletContext;

	@GetMapping({ "/createStaff" })
	public String showHome(Model model, @ModelAttribute("newStaff") Staff newStaff) {
		newStaff = new Staff();
		model.addAttribute("newStaff", newStaff);
		return "createStaff";
	}

	@ModelAttribute("listDepart")
	public List<Department> getListDepart() {
		return departService.findAll();
	}

	@PostMapping("createStaff")
	public String createStaff(Model model, 
			@ModelAttribute("newStaff") Staff newStaff,
			@RequestParam("file-input") MultipartFile photo,
			@RequestParam("birth") @DateTimeFormat(pattern = "yyyy/MM/dd") String birth){

		
		//Convert String to Date
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			newStaff.setBirth(formatter.parse(birth));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		
		
		if (photo.isEmpty()) {

		} else {
			try {
				//image
				String photoPath = servletContext.getRealPath("/imageupload/") + photo.getOriginalFilename();
				photo.transferTo(new File(photoPath));
				System.out.println(photoPath);
				newStaff.setPhoto(photo.getOriginalFilename());
				
				staffService.save(newStaff);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

		return "redirect:/allStaff";
	}
}
