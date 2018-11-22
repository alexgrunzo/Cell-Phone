package com.company;

import java.util.ArrayList;
class Repository {

    ArrayList<Phone> phones = new ArrayList<>();
    ArrayList<Contacts> contacts = new ArrayList<>();
    ArrayList<Messages> messages = new ArrayList<>();
    ArrayList<Calls> calls = new ArrayList<>();
    UI UI = new UI();


    void addContact (Contacts contact){
        contacts.add(contact);
    }

    void listContacts(){
        UI.uiListContacts();
        for (Contacts contact: contacts){
            contact.listContacts();
        }
    }

    void sendMessage(String number, String text) {
            Messages message = new Messages(number, text);
            messages.add(message);
    }
    void listMessage(String number){
        UI.uiListMessages(number);
        for (Messages list: messages){
            if (list.getNumber().equals(number)) {
                list.listMessages();
            }
        }
    }

    void call(String number){
        Calls call = new Calls(number);
        calls.add(call);
    }

    void viewHistory(){
        for (Calls call: calls){
            call.listCalls();
        }
    }

}
