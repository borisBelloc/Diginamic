package fr.diginamic.tp8512_SpringJPA.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private LocalDate hiredate;
	private String lastname;
	private BigDecimal salary;
	private String ssn;
	
	
	
	
	// Constructeur vide pour hibernate
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}


	public Employee(Long id, String firstName, String lastName, LocalDate hireDate, BigDecimal salary, String ssn) {
		this.id = id;
		this.firstname = firstName;
		this.lastname = lastName;
		this.hiredate = hireDate;
		this.salary = salary;
		this.ssn = ssn;
	}
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate date) {
		this.hiredate = date;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	

}
