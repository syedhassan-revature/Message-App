package com.ahtsham;

public class Message implements MessageInterface {
    private String text;

    // parameterized constructor to initialize the text attribute
    public Message(String text){
        this.text = text;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message: " + message);
    }

    // method to print the text message
    public void printMessage(){
        System.out.println(this.text);
    }
    
}
