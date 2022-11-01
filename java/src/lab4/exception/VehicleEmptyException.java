package lab4.exception;

public class VehicleEmptyException extends RuntimeException {
	
	public VehicleEmptyException() {
		super();
	}
	
	public VehicleEmptyException(String str) {
		super(str);
	}
	
	public VehicleEmptyException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public VehicleEmptyException(Throwable ex) {
		super(ex);
	}

}
