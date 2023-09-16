package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {

    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);
    private static final ThreadLocal<StringBuilder> threadLocalLog = new ThreadLocal<>();

    public static void logInfo(String message) {
        logger.info(message);
        threadLocalLog.get().append("[INFO] ").append(message).append("\n");
    }

    public static void logWarning(String message) {
        logger.warn(message);
        threadLocalLog.get().append("[WARN] ").append(message).append("\n");
    }

    public static void logError(String message) {
        logger.error(message);
        threadLocalLog.get().append("[ERROR] ").append(message).append("\n");
    }

    public static String getThreadLocalLogs() {
        if (threadLocalLog.get() != null) {
            return threadLocalLog.get().toString();
        }
        return "";
    }

    public static void initThreadLocalLogs() {
        threadLocalLog.set(new StringBuilder());
    }

    public static void removeThreadLocalLogs() {
        threadLocalLog.remove();
    }
}
