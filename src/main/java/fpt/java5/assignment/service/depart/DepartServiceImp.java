package fpt.java5.assignment.service.depart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.java5.assignment.entities.Department;
import fpt.java5.assignment.repository.depart.DepartmentRepository;

@Service
public class DepartServiceImp implements DepartService {

	@Autowired
	DepartmentRepository departRepository;
	
	@Override
	public List<Department> findAll() {
		return (List<Department>) departRepository.findAll();
	}

	@Override
	public Department getDepartmentById(int idDepartment) {
		return departRepository.findById(idDepartment).get();
	}

	@Override
	public Department save(Department department) {
		return departRepository.save(department);
	}

	@Override
	public void delete(int idDepartment) {
		departRepository.deleteById(idDepartment);
		
	}



}
