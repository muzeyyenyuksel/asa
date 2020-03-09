package com.definex.conceptwave.service;

import com.definex.conceptwave.xml.ManageOrderProcessRequest;

public interface MopService {
    void send(ManageOrderProcessRequest manageOrderProcessRequest);
    String receive();
}
