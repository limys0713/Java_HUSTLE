package logLevels;

public class LogLevels {
	public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        // Return from the next chac after the first " " 
        // Remove the leading and trailing white space using strip()
        // Strip() remove including unicode whitespace comparing to trim() does not remove it
        return logLine.substring(logLine.indexOf(" ") + 1).strip();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        // substring(a, b): String from a to b - 1
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
