package fr.diginamic.tp8510_SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.diginamic.tp8510_SpringJDBC.model.Employee;

// Service : creation d'un bean

@Transactional
public class EmployeeJpaRepository extends AbstractJdbcRepository implements EmployeeRepository {

	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	
	
}
