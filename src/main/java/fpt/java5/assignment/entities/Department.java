package fpt.java5.assignment.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "departs")
@Getter
@Setter
public class Department implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;


    @NotBlank(message = "Name can't be empty")
    @Pattern(regexp = "[A-Za-z0-9\\s]*", message = "The name is not properly formatted")
    @Column(name = "Name")
    private String name;


    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Staff> getStaff = new HashSet<>(0);
}
