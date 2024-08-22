package com.example;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Department")
public class Department {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "DepartmentId")
	    private Integer DepartmentId;

	    @Column(name = "DepartmentName", nullable = false)
	    private String DepartmentName;
	
		// TODO Auto-generated constructor stub
		

}

