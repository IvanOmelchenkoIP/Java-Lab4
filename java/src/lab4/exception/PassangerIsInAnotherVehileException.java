package lab4.exception;

public class PassangerIsInAnotherVehileException extends RuntimeException {

	public PassangerIsInAnotherVehileException() {
		super();
	}
	
	public PassangerIsInAnotherVehileException(String str) {
		super(str);
	}
	
	public PassangerIsInAnotherVehileException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public PassangerIsInAnotherVehileException(Throwable ex) {
		super(ex);
	}
	
}

