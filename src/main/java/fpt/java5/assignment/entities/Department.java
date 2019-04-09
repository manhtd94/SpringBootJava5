package fpt.java5.assignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "departs")
public @Data class Department {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name =  "Id")
	private int id;
	
	@Column(name = "Name")
	private String name;
}

