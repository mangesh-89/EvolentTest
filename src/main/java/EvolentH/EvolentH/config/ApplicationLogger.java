package EvolentH.EvolentH.config;

import org.apache.log4j.Logger;



public class ApplicationLogger {

    static Logger appLogger = Logger.getLogger("EvoHAppender");


    public static void error(Object obj) {

        appLogger.error(obj);

    }

    public static void error(Object obj, Throwable t) {

        appLogger.error(obj, t);

    }

    public static void info(Object obj) {

        appLogger.info(obj);

    }

    public static void info(Object obj, Throwable t) {

        appLogger.info(obj, t);

    }

    public static void debug(Object obj) {

        appLogger.debug(obj);

    }

    public static void debug(Object obj, Throwable t) {

        appLogger.debug(obj, t);

    }

  
}