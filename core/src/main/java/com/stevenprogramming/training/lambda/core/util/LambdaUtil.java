package com.stevenprogramming.training.lambda.core.util;

import java.util.logging.Logger;

public class LambdaUtil {

    public static void printTime(long startTime, long endTime, Logger LOGGER, String method){
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        //LOGGER.info("Duration Method >>>>" + method + " <<<< " + String.valueOf(duration/1000000));
    }
}
