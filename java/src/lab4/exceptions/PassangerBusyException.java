package lab4.exceptions;

public class PassangerBusyException extends RuntimeException {

	public PassangerBusyException() {
		super();
	}
	
	public PassangerBusyException(String str) {
		super(str);
	}
	
	public PassangerBusyException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public PassangerBusyException(Throwable ex) {
		super(ex);
	}
	
}

