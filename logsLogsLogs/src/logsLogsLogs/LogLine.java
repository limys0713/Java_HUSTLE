package logsLogsLogs;

public class LogLine {

    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;    
    }
    
    public void setLogLine(String logLine) { 	// In order to set new context without creating a new object
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        // Switch statement cannot check if a String contains part of another string
        if(logLine.contains("[TRC]")){
            return LogLevel.TRACE;
        }else if(logLine.contains("[DBG]")){
            return LogLevel.DEBUG;
        }else if(logLine.contains("[INF]")){
            return LogLevel.INFO;
        }else if(logLine.contains("[WRN]")){
            return LogLevel.WARNING;
        }else if(logLine.contains("[ERR]")){
            return LogLevel.ERROR;
        }else if(logLine.contains("[FTL]")){
            return LogLevel.FATAL;
        }else{
            return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        String logLevelNumber = "";
        switch(logLevel){
            case UNKNOWN:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            case TRACE:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            case DEBUG:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            case INFO:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            case WARNING:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            case ERROR:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            case FATAL:
                logLevelNumber = Integer.toString(logLevel.getLogLevelNumber());
                break;
            default:
                System.out.println("Error!");
                break;
        }
        return logLevelNumber + ":" + logLine.substring(7);
    }
}
