package com.hcaglar.handlingservletlifecycleevents.servlet.request;

import com.hcaglar.handlingservletlifecycleevents.common.util.ILogger;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class HandleServletRequestAttributeListener implements ServletRequestAttributeListener, ILogger {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        printLog(servletRequestAttributeEvent, "attributeAdded");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        printLog(servletRequestAttributeEvent, "attributeRemoved");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
       printLog(servletRequestAttributeEvent, "attributeReplaced");
    }

    private void printLog(ServletRequestAttributeEvent servletRequestAttributeEvent, String methodName){
        ServletRequest sre = servletRequestAttributeEvent.getServletRequest();
        log("Class: %s ,Method: %s, IP Address : %s", getClass().getName(), methodName, sre.getRemoteAddr());
    }
}
