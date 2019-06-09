package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.service.depart.DepartService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class CreateD {

	@Autowired
	DepartService departService;

	@GetMapping({ "/createDepartment" })
	public String showCreate(Model model, @ModelAttribute("newDepartment") Department newDepartment) {
		model.addAttribute("newDepartment", new Department());
		return "createDepartment";
	}

	@PostMapping("/createDepartment")
	public String save(
					   RedirectAttributes redirectAttributes,
					   @Validated @ModelAttribute("newDepartment") Department newDepartment,
					   BindingResult errors) {
		if (errors.hasErrors()) {
			return "createDepartment";
		} else {
			departService.save(newDepartment);
			redirectAttributes.addFlashAttribute("msg","Create success");
			return "redirect:/alldepartment";
		}
	}

}
