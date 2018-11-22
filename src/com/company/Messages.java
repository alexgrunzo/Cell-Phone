package com.company;

public class Messages {
    String number;
    String text;
    int crt;

    Messages(String number, String text) {
        this.number=number;
        this.text=text;
    }

    void listMessages(){
        System.out.println("Phone number: "+number+" Text message: "+text);
    }

    String getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }


}
