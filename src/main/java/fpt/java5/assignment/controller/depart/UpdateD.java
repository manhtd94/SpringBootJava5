package fpt.java5.assignment.controller.depart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.service.depart.DepartService;

@Controller
public class UpdateD {

    @Autowired
    DepartService departService;

    @PostMapping("updateDepartment/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String saveEdit(RedirectAttributes redirectAttributes,
                           @Validated @ModelAttribute("editDepartment") Department editDepartment,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "updateDepartment";
        } else {
            departService.save(editDepartment);
            redirectAttributes.addFlashAttribute("msg", "Update Success");
            return "redirect:/alldepartment";
        }
    }
}
