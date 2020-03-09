package com.definex.conceptwave.consumer;

import com.definex.conceptwave.entity.Simeranya;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class JmsConsumer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    private String destinationQueue;

    private static final Logger logger = LoggerFactory.getLogger(JmsConsumer.class);

    public Simeranya receive() {
        Simeranya simeranya = castToSimeranya((Map) jmsTemplate.receiveAndConvert(destinationQueue));
        simeranya.setName("ddd");
        logger.info("received message='{}'", simeranya);
        return simeranya;
    }

    private Simeranya castToSimeranya(Map map) {
        return new Simeranya(((int) map.get("id")),"müzeyyen", ((String) map.get("description")));
    }
}
