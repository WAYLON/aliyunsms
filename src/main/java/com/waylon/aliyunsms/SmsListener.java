package com.waylon.aliyunsms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SmsListener {
    @JmsListener(destination = "VALIDATE")
    public void sendSms(Map<String, String> map) {
        SmsUtil.sendShortMessage(SmsUtil.VALIDATE_CODE, map.get("mobile"), map.get("params"));
    }

}
