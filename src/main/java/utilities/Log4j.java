
package utilities;
import org.apache.log4j.Logger;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Log4j {
    LocalTime time = LocalTime.now();
    private static Logger Log = Logger.getLogger(Log4j.class.getName());


    //Info Level




    //Error Level
    public static void error (String message) {
        Log.error(message);
    }



    //Debug Level
    public static void debug (String message) {
        Log.debug(message);
    }
}
