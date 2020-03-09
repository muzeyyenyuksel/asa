package com.definex.conceptwave.service;


import com.definex.conceptwave.entity.Simeranya;

public interface JmsService {
    public void send(Simeranya simeranya);

    public Simeranya receive();
}
