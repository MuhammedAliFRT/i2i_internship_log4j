package org.example;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class myTimerLoggings {

    private static Logger Log = Logger.getLogger(myTimerLoggings.class.getName());

    public static void main(String[] args) throws InterruptedException {
        debug();
        info();
        error();


    }

    //Info Level
    public static void debug() throws InterruptedException {

        for (int i = 0; i < 3; i++) {


            long yourmilliseconds = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
            Date resultdate = new Date(yourmilliseconds);
            System.out.println(sdf.format(resultdate));
            Log.debug(sdf.format(resultdate));

            TimeUnit.SECONDS.sleep(1);


        }

    }
    public static void info() throws InterruptedException {
        for (int i = 0; i < 3; i++) {


            long yourmilliseconds = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
            Date resultdate = new Date(yourmilliseconds);
            System.out.println(sdf.format(resultdate));
            Log.info(sdf.format(resultdate));

            TimeUnit.MINUTES.sleep(1);

        }
    }

    //Error Level
    public static void error() throws InterruptedException {
        for (int i = 0; i < 3; i++) {


            long yourmilliseconds = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
            Date resultdate = new Date(yourmilliseconds);
            System.out.println(sdf.format(resultdate));
            Log.error(sdf.format(resultdate));
            TimeUnit.HOURS.sleep(1);
        }
    }


}

