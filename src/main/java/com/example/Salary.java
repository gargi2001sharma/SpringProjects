package com.example;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "Salary")
public class Salary {

	 @Id
	    @Column(name = "EmployeeId")
	    private Integer EmployeeId;

	    @Column(name = "Salary", nullable = false)
	    private Double Salary;

	    @OneToOne
	    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
	    private Employee employee;

}
