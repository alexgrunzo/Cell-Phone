package com.company;

public class iPhone implements Phone {

    String material="Default";

    Repository memory = new Repository();
    static Integer batteryLife = 100;
    static UI ui = new UI();

    boolean hasBattery(int batteryCheck) {
        if (batteryLife - batteryCheck > 0) {
            return true;
        } else{
            System.out.println("Not enough battery");
            return false;
        }

    }

    void drainBattery(int batteryDrain) {
        batteryLife -= batteryDrain;
        System.out.println(batteryDrain + " has been drained, you have " + batteryLife + " left.");
        System.out.println("\n");
    }

    public void addContact(String crt, String number, String fName, String lName) {
        if (hasBattery(15) ) {
            System.out.println("Adding "+fName+" "+lName);
            Contacts contact = new Contacts(crt, number, fName, lName);
            memory.addContact(contact);
            drainBattery(15);
        }
    }

    public void listContacts() {
        if (hasBattery(15)) {
            memory.listContacts();
            drainBattery(15);
        }
    }

    public void sendMessage(String number, String text) {
        if (hasBattery(15) || text.length() < 500) {
            ui.messageSending(number, text);
            memory.sendMessage(number, text);
            drainBattery(15);
        }
    }

    public void listMessages (String number){

        if (hasBattery(15)) {
            memory.listMessage(number);
            drainBattery(15);
        }

    }

    public void call (String number){
        if (hasBattery(20)) {
            ui.callingMessage(number);
            memory.call(number);
            drainBattery(20);
        }
    }

    public void viewHistory () {

        if (hasBattery(15)) {
            memory.viewHistory();
            drainBattery(15);
        }

    }

}




