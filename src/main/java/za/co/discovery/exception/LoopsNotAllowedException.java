package za.co.discovery.exception;

public class LoopsNotAllowedException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Source and Destination cannot be the same";
	}
}