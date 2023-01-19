package ex05_exception_class;


public class GunException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3700059434730916901L;

	private String exceptionCode;
	
	public GunException(String message, String exceptionCode) {
		super(message);
		this.exceptionCode = exceptionCode;
		
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}
	
	
	
}
