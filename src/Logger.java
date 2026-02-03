public class Logger {

    public enum LogLevel {
        ERROR, WARNING, INFO
    }

    public void log(LogLevel level, String message) {
        System.out.println(level + ": " + message);
    }
}
