package logsLogsLogs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 1
		var logLine = new LogLine("[INF]: File deleted");
		System.out.println(logLine.getLogLevel());
		// => LogLevel.INFO
		// Task 2
		logLine.setLogLine("[XYZ]: Overly specific, out of context message");
		System.out.println(logLine.getLogLevel());
		// => LogLevel.UNKNOWN
		// Task 3
		logLine.setLogLine("[ERR]: Stack Overflow");
		System.out.println(logLine.getOutputForShortLog());
		// => "6:Stack Overflow"
	}

}
