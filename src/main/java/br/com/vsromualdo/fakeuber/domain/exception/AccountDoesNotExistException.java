package br.com.vsromualdo.fakeuber.domain.exception;

public class AccountDoesNotExistException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8837427137191066836L;

	public AccountDoesNotExistException(String message) {
        super(message);
    }
	
	public AccountDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
