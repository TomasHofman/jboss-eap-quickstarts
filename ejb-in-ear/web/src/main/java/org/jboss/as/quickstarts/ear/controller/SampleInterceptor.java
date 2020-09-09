package org.jboss.as.quickstarts.ear.controller;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;
import org.jboss.logging.Logger;

public class SampleInterceptor implements Interceptor<Message> {

    private final Logger logger = Logger.getLogger(getClass());

    public void handleMessage(Message message) throws Fault {
        logger.infof("Inbound message id: %s", message.getId());
    }

    public void handleFault(Message message) {

    }
}
