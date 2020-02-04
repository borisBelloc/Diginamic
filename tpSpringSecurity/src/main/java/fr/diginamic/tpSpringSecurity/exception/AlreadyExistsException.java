package fr.diginamic.tpSpringSecurity.exception;

public class AlreadyExistsException extends Exception {

	private static final long serialVersionUID = -710350638712688312L;

	public AlreadyExistsException(String message) {
		super(message);
	}
}