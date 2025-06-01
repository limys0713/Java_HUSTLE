package calculatorConundrum;

public class IllegalOperationException extends RuntimeException { // RuntimException is a serializable class
	// Serializable classes should (but don't have to) declare a special ID called serialVersionUID.
	private static final long serialVersionUID = 1L;
	
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
