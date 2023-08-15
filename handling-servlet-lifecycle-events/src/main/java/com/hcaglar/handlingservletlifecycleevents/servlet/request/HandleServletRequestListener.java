package com.hcaglar.handlingservletlifecycleevents.servlet.request;

import com.hcaglar.handlingservletlifecycleevents.common.util.ILogger;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HandleServletRequestListener implements ServletRequestListener, ILogger {

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        printLog(servletRequestEvent, "requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        printLog(servletRequestEvent, "requestDestroyed");
    }

    private void printLog(ServletRequestEvent servletRequestEvent, String methodName){
        ServletRequest sre = servletRequestEvent.getServletRequest();
        log("Class: %s ,Method: %s, IP Address : %s", getClass().getName(), methodName, sre.getRemoteAddr());
    }
}
