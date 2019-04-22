package fpt.java5.assignment.service.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.java5.assignment.entities.Staff;
import fpt.java5.assignment.repository.staff.StaffRepository;

@Service
public class StaffServiceImp implements StaffService {

	@Autowired
	StaffRepository staffRepository;
	
	@Override
	public List<Staff> getAllStaffs() {
		return (List<Staff>) staffRepository.findAll();
	}

	@Override
	public Staff save(Staff staff) {
		return staffRepository.save(staff);
	}

	@Override
	public void delete(int idStaff) {
		staffRepository.deleteById(idStaff);;
	}

	@Override
	public Staff getStaffById(int idStaff) {
		return staffRepository.findById(idStaff).get();
	}

	@Override
	public List<Staff> findStaffByName(String name) {
		return staffRepository.findByNameLike(name);
	}

}
