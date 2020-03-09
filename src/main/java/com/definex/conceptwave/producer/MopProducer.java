package com.definex.conceptwave.producer;

import com.definex.conceptwave.entity.Mop;
import com.definex.conceptwave.xml.ManageOrderProcessRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class MopProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    private String destinationQueue;

    private static final Logger logger = LoggerFactory.getLogger(MopProducer.class);

    public void send(ManageOrderProcessRequest manageOrderProcessRequest) {
        logger.info("sent message='{}'",manageOrderProcessRequest);
        try {
            jmsTemplate.convertAndSend(destinationQueue, manageOrderProcessRequest.getSubscriptionId());
        }catch (JmsException ex){
            ex.toString();
        }
    }
}
