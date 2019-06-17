package fpt.java5.assignment.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role")
	private int role;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany(mappedBy  = "roles")
	private Set<User> users;
	
}
