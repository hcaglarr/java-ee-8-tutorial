package com.hcaglar.handlingservletlifecycleevents.servlet.context;

import com.hcaglar.handlingservletlifecycleevents.common.util.ILogger;
import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HandleServletContextAttributeListener implements ServletContextAttributeListener, ILogger {

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        log("Class: %s ,Method: attributeAdded%n", getClass().getName());
    }
}
