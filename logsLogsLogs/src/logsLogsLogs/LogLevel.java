package logsLogsLogs;

public enum LogLevel {
    // Like static constant
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int logLevelNumber;

    LogLevel(int logLevelNumber){
        this.logLevelNumber = logLevelNumber;
    }

    public int getLogLevelNumber(){
        return this.logLevelNumber;
    }
}
