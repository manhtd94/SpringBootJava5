package fpt.java5.assignment.service.depart;

import java.util.List;

import fpt.java5.assignment.entities.Department;

public interface DepartService {
	public List<Department> findAll();
	
	public Department getDepartmentById(int idDepartment);
	
	public Department save(Department depart);
	
	public void delete(int idDepartment);

}
