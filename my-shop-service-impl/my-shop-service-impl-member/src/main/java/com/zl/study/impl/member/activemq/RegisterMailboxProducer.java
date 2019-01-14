package com.zl.study.impl.member.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;


/**
 * @Description
 * @Project my-shopping-parent
 * @Package com.zl.study.member.activemq
 * @ClassName RegisterMailboxProducer
 * @Author 曾灵
 * @QQ|Email 3195690389|17363645521@163.com
 * @Date 2018-10-18 下午9:24
 * @Version 1.0
 * @Modified By
 */
@Component
public class RegisterMailboxProducer {
    @Autowired
    private JmsMessagingTemplate template;

    public void sendMessage(Destination destination, String json) {
        template.convertAndSend(destination, json);
    }
}
