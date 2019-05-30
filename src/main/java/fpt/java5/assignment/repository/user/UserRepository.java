package fpt.java5.assignment.repository.user;

import fpt.java5.assignment.entities.Staff;
import org.springframework.data.repository.CrudRepository;

import fpt.java5.assignment.entities.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Staff, Integer>  {
	
	Staff findByUserName(String userName);
}
