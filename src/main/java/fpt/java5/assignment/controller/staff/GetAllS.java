package fpt.java5.assignment.controller.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.service.pagination.Pagination;
import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class GetAllS {
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	Pagination pagination;
	
	@GetMapping({"/allStaff"})
	public String showPage(Model model,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page) {
		
		//Số phần tử trong 1 page
		int size = 10;
		Pageable pageable = PageRequest.of((page - 1), size);

		model.addAttribute("listStaffs", pagination.listStaffInPage(pageable));
		
		//Số trang pagination
		List<Staff> listDepart = staffService.getAllStaffs();
		
		//Số phần tử trong list
		int lengthOfList = listDepart.size();
		model.addAttribute("numberPagination", pagination.numberPagination(size,lengthOfList));
		
		//model.addAttribute("listStaffs", staffService.getAllStaffs());
		return "allStaff";
	}
}
