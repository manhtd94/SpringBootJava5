package fpt.java5.assignment.controller.staff;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.entities.Role;
import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.role.RoleRepository;
import fpt.java5.assignment.service.depart.DepartService;
import fpt.java5.assignment.service.staff.StaffService;
import fpt.java5.assignment.service.user.CreateNewUser;

@Controller
public class CreateS {

    private DepartService departService;

    private StaffService staffService;

    private ServletContext servletContext;

    private CreateNewUser createNewUser;

    private RoleRepository roleRepository;

    @Autowired
    public CreateS(DepartService _departService, StaffService _staffService, ServletContext _servletContext,
                   CreateNewUser _createNewUser, RoleRepository _roleRepository) {
        this.departService = _departService;
        this.staffService = _staffService;
        this.servletContext = _servletContext;
        this.createNewUser = _createNewUser;
        this.roleRepository = _roleRepository;
    }

    @GetMapping({"/createStaff"})
    public String showHome(Model model, @ModelAttribute("newStaff") Staff newStaff) {
        model.addAttribute("newStaff", new Staff());
        return "createStaff";
    }

    @ModelAttribute("listDepart")
    public List<Department> getListDepart() {
        return departService.findAll();
    }

    @PostMapping("createStaff")
    public String createStaff(Model model,
                              @RequestParam("file-input") MultipartFile photo,
                              @Validated @ModelAttribute("newStaff") Staff newStaff,
                              BindingResult errors) {

        if (errors.hasErrors()) {
            return "createStaff";
        } else {

            if (photo.isEmpty()) {
                model.addAttribute("errorImage", "Image can't be empty");
                return "createStaff";
            } else {
                try {
                    // image
                    String photoPath = servletContext.getRealPath("/imageupload/") + photo.getOriginalFilename();
                    photo.transferTo(new File(photoPath));
                    newStaff.setPhoto(photo.getOriginalFilename());

                    //save new staff
                    staffService.save(newStaff);

                    //id of newStaff
                    int idNewStaff = newStaff.getId();

                    //create account
                    String userName = createNewUser.createNewUser(newStaff.getName(), idNewStaff);
                    newStaff.setUserName(userName);

                    //Default password Bcrypt 123
                    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                    String defaultPassword = passwordEncoder.encode("123");
                    newStaff.setPassword(defaultPassword);

                    //add role member for new Staff
                    Set<Role> roleNewStaff = new HashSet<>();
                    roleNewStaff.add(roleRepository.findByName("ROLE_MEMBER"));
                    newStaff.setRoles(roleNewStaff);

                    staffService.save(newStaff);

                    model.addAttribute("newStaff", newStaff);

                    System.out.println(newStaff.getId());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return "staff/createSuccess";
        }
    }
}
