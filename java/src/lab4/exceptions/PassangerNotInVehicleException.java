package lab4.exceptions;

public final class PassangerNotInVehicleException extends RuntimeException {
	
	public PassangerNotInVehicleException() {
		super();
	}
	
	public PassangerNotInVehicleException(String str) {
		super(str);
	}
	
	public PassangerNotInVehicleException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public PassangerNotInVehicleException(Throwable ex) {
		super(ex);
	}
	
}
