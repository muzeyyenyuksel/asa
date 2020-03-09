package com.definex.conceptwave.service;

import com.definex.conceptwave.consumer.JmsConsumer;
import com.definex.conceptwave.entity.Simeranya;
import com.definex.conceptwave.producer.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JmsServiceImp implements JmsService {
    @Autowired
    private JmsProducer jmsProducer;

    @Autowired
    private JmsConsumer jmsConsumer;

    @Override
    public void send(Simeranya simeranya) {
        jmsProducer.send(simeranya);
    }

    @Override
    public Simeranya receive() {
        return jmsConsumer.receive();
    }
}
