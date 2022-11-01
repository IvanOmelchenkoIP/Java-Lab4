package lab4.exceptions;

public final class VehicleFullException extends RuntimeException {

	public VehicleFullException() {
		super();
	}
	
	public VehicleFullException(String str) {
		super(str);
	}
	
	public VehicleFullException(String str, Throwable ex) {
		super(str, ex);
	}
	
	public VehicleFullException(Throwable ex) {
		super(ex);
	}

}
