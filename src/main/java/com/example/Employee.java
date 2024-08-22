package com.example;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Employee")
public class Employee {

	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "EmployeeId")
	    private Integer EmployeeId;

	    @Column(name = "EmployeeName", nullable = false)
	    private String EmployeeName;

	    @ManyToOne
	    @JoinColumn(name = "department_id")
	    private Department department;
		
		
		
	}

	


