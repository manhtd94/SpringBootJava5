package fpt.java5.assignment.service.staff;

import java.util.List;

import fpt.java5.assignment.entities.Staff;

public interface StaffService {
	
	public List<Staff> getAllStaffs();
	
	public Staff save(Staff staff);
	
	public void delete(int idStaff);
	
	public Staff getStaffById(int idStaff);
	
	public List<Staff> findStaffByName(String name);
	
}
