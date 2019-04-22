package fpt.java5.assignment.repository.user;

import org.springframework.data.repository.CrudRepository;

import fpt.java5.assignment.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>  {
	
	User findByUserName(String userName);
}
