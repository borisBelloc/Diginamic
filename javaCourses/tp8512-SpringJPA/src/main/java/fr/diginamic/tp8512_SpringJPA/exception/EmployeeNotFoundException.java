package fr.diginamic.tp8512_SpringJPA.exception;

public class EmployeeNotFoundException extends Exception {
	
	
	// pourquoi serializer ?
	private static final long serialVersionUID = 888723466945817278L;

	public EmployeeNotFoundException(long id) {
		super(String.format("CUSTOM->Employee with id %s does not exist.", id));
	}
}