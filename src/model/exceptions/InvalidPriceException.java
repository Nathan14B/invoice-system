package model.exceptions;

public class InvalidPriceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public InvalidPriceException(String message) {
		super(message);
	}
}
