package com.waylon.aliyunsms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SmsController {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/activeMqSms")
    public void activeMqSms() {
        Map<String,String> map = new HashMap<>(2);
        map.put("mobile", "****");
        map.put("params", "111112");
        jmsMessagingTemplate.convertAndSend("VALIDATE", map);
    }

}
