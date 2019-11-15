package fr.diginamic.tp8510_SpringJDBC.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.diginamic.tp8510_SpringJDBC.model.Employee;

// Service : creation d'un bean
// Repository :

@Transactional
@Repository
public class EmployeeJdbcRepository extends AbstractJdbcRepository implements EmployeeRepository {

	public void save(Employee employee) {
		this.getJdbcTemplate().update(
				"INSERT INTO employee (firstname, hiredate, lastname, salary, ssn) values (?, ?, ?, ?, ?)",
				employee.getFirstname(), employee.getHiredate(), employee.getLastname(), employee.getSalary(),
				employee.getSsn());
	}
	
	public List<Employee> findAll() {
		String sqlQuery = "SELECT id, firstname, lastname, hiredate, salary, ssn FROM employee";
		return getJdbcTemplate().query(sqlQuery, new EmployeeRowMapper());
	}
	
	public Employee findBySsn(String ssn) {
		String sqlQuery = "SELECT id, firstname, lastname, hiredate, salary, ssn FROM employee WHERE ssn = ?";
		return getJdbcTemplate().queryForObject(sqlQuery, new EmployeeRowMapper(), ssn);
	}

	public void update(Employee employee) {
		String sqlQuery = "UPDATE employee SET firstname = ?, lastname = ?, hiredate = ?, salary = ?, ssn = ? WHERE id = ?";
		getJdbcTemplate().update(sqlQuery, employee.getFirstname(), employee.getFirstname(), employee.getHiredate(), employee.getSalary(), employee.getSsn(), employee.getId());
	}

	public void delete(Long employeeId) {
		String sqlQuery = "DELETE FROM employee WHERE id = ?";
		getJdbcTemplate().update(sqlQuery, employeeId);
	}
	
	public void deleteAllEmployees() {
		String sqlQuery = "DELETE FROM employee";
		getJdbcTemplate().update(sqlQuery);
	}
	
	
	//	ROW MAPPER POUR UTILISER LE SELECT ::
	private final class EmployeeRowMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			
			employee.setId(rs.getLong("id"));
			employee.setFirstname(rs.getString("firstname"));
			employee.setLastname(rs.getString("lastname"));
			Date hireDate = rs.getDate("hiredate");
			if (hireDate != null) {
				LocalDate hireLocalDate = hireDate.toLocalDate();
				employee.setHiredate(hireLocalDate);
			}
			employee.setSalary(rs.getBigDecimal("salary"));
			employee.setSsn(rs.getString("ssn"));
			return employee;
		}
	}
	
	
	
	
	
}
