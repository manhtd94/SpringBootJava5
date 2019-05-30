package fpt.java5.assignment.controller.depart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.service.depart.DepartService;
import fpt.java5.assignment.service.pagination.Pagination;

@Controller
public class GetAllD {

	@Autowired
	Pagination pagination;
	
	@Autowired
	DepartService departService;

	@GetMapping({ "/alldepartment" })
	public String showHome(Model model,
			@RequestParam(name = "page", required = false, defaultValue = "1") Integer page) {
		Pageable pageable = PageRequest.of((page - 1), 4);

//		model.addAttribute("allDepartment", departService.findAll());
		model.addAttribute("allDepartment", pagination.listDepartmentInPage(pageable));
		
		//Số trang pagination
		List<Department> listDepart = departService.findAll();
		int size = listDepart.size();
		model.addAttribute("numberPagination", pagination.numberPagination(4,size));
		return "alldepartment";
	}
}
