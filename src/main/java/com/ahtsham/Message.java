package com.ahtsham;

public class Message {
    private String text;

    // parameterized constructor to initialize the text attribute
    public Message(String text){
        this.text = text;
    }

    // method to print the text message
    public void printMessage(){
        System.out.println(this.text);
    }
    
}
