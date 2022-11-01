package lab4.exception;

public class VehicleIsFullException extends RuntimeException {

	public VehicleIsFullException() {
		super();
	}
	
	public VehicleIsFullException(String str) {
		super(str);
	}
	
	public VehicleIsFullException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public VehicleIsFullException(Throwable ex) {
		super(ex);
	}

}
