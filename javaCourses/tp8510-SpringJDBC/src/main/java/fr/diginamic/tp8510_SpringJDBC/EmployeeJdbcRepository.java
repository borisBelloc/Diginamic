package fr.diginamic.tp8510_SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

// Service : creation d'un bean

@Service
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
