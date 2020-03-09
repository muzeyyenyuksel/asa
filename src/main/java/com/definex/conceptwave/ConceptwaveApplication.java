package com.definex.conceptwave;

import com.definex.conceptwave.consumer.MessageSender;
import com.definex.conceptwave.producer.MessageReceiver;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConceptwaveApplication {


    public static void main(String[] args) throws InterruptedException {
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");

        MessageSender messageSender = (MessageSender) ctx.getBean("jmsSender");
        MessageReceiver messageReceiver = (MessageReceiver) ctx.getBean("jmsReceiver");
        while (true) {
            messageSender.sendMessage("Test DATA");
            messageReceiver.receiveMessage();

            Thread.currentThread().sleep(1000);
        }*/
        SpringApplication.run(ConceptwaveApplication.class, args);
    }


}
