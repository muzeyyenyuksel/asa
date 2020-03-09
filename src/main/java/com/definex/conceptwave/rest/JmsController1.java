package com.definex.conceptwave.rest;

import com.definex.conceptwave.entity.Mop;
import com.definex.conceptwave.service.MopService;
import com.definex.conceptwave.xml.ManageOrderProcessRequest;
import com.definex.conceptwave.xml.ManageOrderProcessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jms")
public class JmsController1 {

    @Autowired
    private MopService service;

    @PostMapping(path ="/mop",consumes = {"application/json"})
    public void send(@RequestBody ManageOrderProcessRequest manageOrderProcessRequest){
        service.send(manageOrderProcessRequest);
    }

    @GetMapping(path ="/mop")
    public String receive(){
        return service.receive();
    }
}
