package fpt.java5.assignment.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "staffs")
@Getter
@Setter
public class Staff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotBlank(message = "Name can't be empty")
	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private int gender;

	@NotNull(message = "Birthday can't be empty")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	private Date birth;

	@Column(name = "photo")
	private String photo;

	@NotBlank(message = "Email can't be empty")
	@Column(name = "email")
	private String email;

	@NotNull(message = "Phone can't be empty")
	@Column(name = "phone")
	private int phone;

	@DecimalMin(value = "1000000")
	@Column(name = "salary")
	private float salary;

	@NotNull(message = "Note can't be empty")
	@Column(name = "notes")
	private String note;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
				name = "user_role",
				joinColumns = @JoinColumn(name = "id_user"),
				inverseJoinColumns = @JoinColumn(name = "id_role")
			)
	private Set<Role> roles;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "depart_id") // name in db
	private Department department;
	
	@OneToMany(mappedBy = "staff", fetch =  FetchType.LAZY)
	private Set<Record> record;
}
