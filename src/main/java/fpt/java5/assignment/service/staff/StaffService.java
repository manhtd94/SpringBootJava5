package fpt.java5.assignment.service.staff;

import java.util.List;

import fpt.java5.assignment.entities.Staff;

public interface StaffService {
	
	 List<Staff> getAllStaffs();
	
	 Staff save(Staff staff);
	
	 void delete(int idStaff);
	
	 Staff getStaffById(int idStaff);
	
	 List<Staff> findStaffByName(String name);

	 boolean validateImageName(String name);
	
}
