package fpt.java5.assignment.repository.role;

import org.springframework.data.repository.CrudRepository;

import fpt.java5.assignment.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
}
