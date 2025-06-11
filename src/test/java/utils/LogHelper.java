package utils;

import com.aventstack.extentreports.Status;
import hooks.Hooks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {
    static Logger logger = LogManager.getLogger(LogHelper.class);

    public static void logInfo(String message) {
        logger.info(message);
        Hooks.test.log(Status.INFO, message);
    }

    public static void logError(String message) {
        logger.error(message);
        Hooks.test.log(Status.FAIL, message);
    }

    public static void logPass(String message) {
        logger.info(message);
        Hooks.test.log(Status.PASS, message);
    }

    public static void logFail(String message) {
        logger.error(message);
        Hooks.test.log(Status.FAIL, message);
    }
}
