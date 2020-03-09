package com.definex.conceptwave.producer;

import com.definex.conceptwave.entity.Mop;
import com.definex.conceptwave.xml.ManageOrderProcessRequest;
import com.definex.conceptwave.xml.ManageOrderProcessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.HashMap;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @GetMapping("/{message}")
    @PostMapping
    public String publish(@PathVariable("message")
                          final String message) {

        jmsTemplate.convertAndSend(queue, message);

        return message;
    }

    @RequestMapping(value = "/mop", method = RequestMethod.POST)
    public ResponseEntity<ManageOrderProcessResponse> update(@RequestBody ManageOrderProcessRequest manageOrderProcessRequest) throws JAXBException {
        jmsTemplate.convertAndSend(queue, manageOrderProcessRequest);
        /*JAXBContext jaxbContext = JAXBContext.newInstance(ManageOrderProcessResponse.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        ManageOrderProcessResponse manageOrderProcessResponse= (ManageOrderProcessResponse)unmarshaller.unmarshal(new File("manageOrderProcess.xml"));
        manageOrderProcessResponse.getResult();*/
        ManageOrderProcessResponse manageOrderProcessResponse =new ManageOrderProcessResponse();
        manageOrderProcessResponse.setResult("deneme");
        return new ResponseEntity<ManageOrderProcessResponse>(manageOrderProcessResponse, HttpStatus.OK);
    }

    @Bean // Serialize message content to json using TextMessage
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);

        converter.setTypeIdPropertyName("standalone.queue");
        //now set idMappings for serialization/deserialization
        HashMap<String, Class<?>> idMapping = new HashMap<String, Class<?>>();
        idMapping.put(ManageOrderProcessRequest.class.getName(), ManageOrderProcessRequest.class);
        converter.setTypeIdMappings(idMapping);

        return converter;
    }
}
