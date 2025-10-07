package com.ahtsham;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // object instanciation of Message
        Message message = new Message("Are you going?");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmailService emailService = context.getBean("emailService",EmailService.class);
        emailService.sendMessage("Hello from Email Service");   

    }
}
