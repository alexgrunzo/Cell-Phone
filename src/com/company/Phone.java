package com.company;

public interface Phone {


    void addContact(String crt, String number, String fName, String lName);

    void sendMessage(String number, String text);

    void call(String number);

    void listContacts();

    void listMessages(String number);

    void viewHistory();


}
