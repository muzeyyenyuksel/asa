package com.definex.conceptwave.service;

import com.definex.conceptwave.consumer.MopConsumer;
import com.definex.conceptwave.producer.MopProducer;
import com.definex.conceptwave.xml.ManageOrderProcessRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MopServiceImp implements MopService {

    @Autowired
    private MopProducer mopProducer;

    @Autowired
    private MopConsumer mopConsumer;

    @Override
    public void send(ManageOrderProcessRequest manageOrderProcessRequest) {
        mopProducer.send(manageOrderProcessRequest);
    }

    @Override
    public String receive() {
        return mopConsumer.receive();
    }
}
