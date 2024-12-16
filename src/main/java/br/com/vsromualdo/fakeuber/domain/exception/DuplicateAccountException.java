package br.com.vsromualdo.fakeuber.domain.exception;

public class DuplicateAccountException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 837427137191066001L;

	public DuplicateAccountException(String message) {
        super(message);
    }
	
	public DuplicateAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
