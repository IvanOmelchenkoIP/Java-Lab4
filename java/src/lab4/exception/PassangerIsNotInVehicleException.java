package lab4.exception;

public final class PassangerIsNotInVehicleException extends RuntimeException {
	
	public PassangerIsNotInVehicleException() {
		super();
	}
	
	public PassangerIsNotInVehicleException(String str) {
		super(str);
	}
	
	public PassangerIsNotInVehicleException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public PassangerIsNotInVehicleException(Throwable ex) {
		super(ex);
	}
	
}
