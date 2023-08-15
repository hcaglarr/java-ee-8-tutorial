package com.hcaglar.handlingservletlifecycleevents.common.util;


import java.util.logging.Level;
import java.util.logging.Logger;

public interface ILogger {

    Logger LOG = Logger.getLogger(ILogger.class.getName());

    default void log(String format, Object ...objects){
        LOG.log(Level.INFO, String.format(format, objects));
    }

}
