package fpt.java5.assignment.controller.staff;

import java.io.File;
import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.service.depart.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fpt.java5.assignment.entities.Role;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.role.RoleRepository;
import fpt.java5.assignment.service.staff.StaffService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UpdateS {


    @Autowired
    DepartService departService;

    @Autowired
    StaffService staffService;

    @Autowired
    ServletContext servletContext;

    @Autowired
    RoleRepository roleRepository;

    @PostMapping("/updateStaff/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String updateStaff(Model model,
                              RedirectAttributes redirectAttributes,
                              @PathVariable("id") int idStaff,
                              @RequestParam("file-input") MultipartFile photo,
                              @RequestParam("imageName") String imageName,
                              @RequestParam("boxRole") String[] role,
                              @Validated @ModelAttribute("staffUpdate") Staff staffUpdate,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "updateStaff";
        } else {
            if (photo.isEmpty()) {
                staffUpdate.setPhoto(imageName);
            } else {
                if (!staffService.validateImageName(photo.getOriginalFilename())) {
                    model.addAttribute("errorImage", "Image just is jpg or png");
                    return "updateStaff";
                } else if (photo.getSize() > 10485760) {
                    model.addAttribute("errorImage", "Your image has size too large");
                    return "updateStaff";
                } else {
                    try {
                        String photoPath = servletContext.getRealPath("/imageupload/") + photo.getOriginalFilename();
                        photo.transferTo(new File(photoPath));
                        staffUpdate.setPhoto(photo.getOriginalFilename());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            //Get userName and Password
            //Get information login of  staff has id = {id}
            Staff staffLogin = staffService.getStaffById(idStaff);
            staffUpdate.setUserName(staffLogin.getUserName());
            staffUpdate.setPassword(staffLogin.getPassword());

            //Set role of staff
            Set<Role> roles = new HashSet<>();
            for (String roless : role) {
                roles.add(roleRepository.findByName(roless));
            }
            staffUpdate.setRoles(roles);
            staffService.save(staffUpdate);

            redirectAttributes.addFlashAttribute("msg", "Update Success Staff");
            return "redirect:/allStaff";
        }
    }

    @ModelAttribute("listDepart")
    public List<Department> getListDepart() {
        return departService.findAll();
    }
}