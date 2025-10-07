package com.ahtsham;

public class EmailService implements MessageInterface {
    private String emailAddress;

    // parameterized constructor to initialize emailAddress
    public EmailService(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // implementing the method from MessageInterface
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Message: " + message + " sent to " + emailAddress);
    }

}
