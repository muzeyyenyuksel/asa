package com.definex.conceptwave.consumer;

import com.definex.conceptwave.xml.ManageOrderProcessRequest;
import com.definex.conceptwave.xml.ManageOrderProcessResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MopConsumer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    private String destinationQueue;

    private static final Logger logger = LoggerFactory.getLogger(MopConsumer.class);

//@JmsListener(destination = "${jms.queue.destination}")
    public String receive() {
        Object manageOrderProcessResponse = jmsTemplate.receiveAndConvert(destinationQueue);
        //logger.info("received message='{}'", manageOrderProcessResponse1.toString());
        return manageOrderProcessResponse.toString();
    }

}
