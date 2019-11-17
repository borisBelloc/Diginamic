package fr.diginamic.tp8510_SpringJDBC.exception;

public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = 888723466945817278L;

	public EmployeeNotFoundException(long id) {
		super(String.format("Employee with id %s does not exist.", id));
	}
}