package fpt.java5.assignment.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	@Column(name = "name")
	private String name;

	@Column(name = "gender")
	private int gender;

	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "birthday")
	private Date birth;

	@Column(name = "photo")
	private String photo;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private int phone;

	@Column(name = "salary")
	private float salary;

	@Column(name = "notes")
	private String note;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "depart_id") // name in db
	private Department department;
	
	@OneToMany(mappedBy = "staff", fetch =  FetchType.LAZY)
	private Set<Record> getRecord; 
}
