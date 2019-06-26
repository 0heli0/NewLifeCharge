package com.newlife.charge.service.impl;


import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;

public class ActiveMqServiceImpl {

    public static final String ACTIVEMQ_URL = "192.168.235.128:61616";

    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        Connection connection =  connectionFactory.createConnection();
        connection.start();

        connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

    }
}
