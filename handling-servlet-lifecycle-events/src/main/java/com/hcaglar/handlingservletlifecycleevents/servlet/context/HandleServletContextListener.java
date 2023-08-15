package com.hcaglar.handlingservletlifecycleevents.servlet.context;

import com.hcaglar.handlingservletlifecycleevents.common.util.ILogger;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import static com.hcaglar.handlingservletlifecycleevents.common.constant.ParameterConstants.SERVLET_CONTEXT_LISTENER_LABEL;

@WebListener
public class HandleServletContextListener implements ServletContextListener, ILogger {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String content = servletContextEvent.getServletContext().getInitParameter(SERVLET_CONTEXT_LISTENER_LABEL);
        log("Class: %s ,Method: contextInitialized, Content: %s", getClass().getName(), content);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log("Class: %s ,Method: contextDestroyed", getClass().getName());
    }
}
