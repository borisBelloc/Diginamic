package fr.diginamic.tp8512_SpringJPA.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.diginamic.tp8512_SpringJPA.model.Employee;



@Repository
public class EmployeeJpaRepository extends AbstractJpaRepository implements EmployeeRepository {

	
	public void save(Employee employee) {
		System.out.println("INSIDE EmployeeJpaRepository.save() :: SAVED IN DB");
		super.persist(employee);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long employeeId) {
		// 	super.delete(employee);
	}

	public void deleteEmployee(Employee employee) {
		System.out.println("EMPLOYEE DELETED");
		super.delete(employee);
	}

	
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}


	
}
