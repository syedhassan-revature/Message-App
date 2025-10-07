package com.ahtsham;

public class NotificationService {
    private Message message;
    private EmailService emailService;
    
    // parameterized constructor to initialize Message and EmailService
    public NotificationService(Message message, EmailService emailService) {
        this.message = message;
        this.emailService = emailService;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyByMessage(String msg) {
        message.sendMessage(msg);
    }

    public void notifyByEmail(String msg) {
        emailService.sendMessage(msg);
    }

}
