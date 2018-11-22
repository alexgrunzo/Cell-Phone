package com.company;

public abstract class Samsung implements Phone {

    String material = "Default";


    public Repository memory = new Repository();
    static Integer batteryLife = 100;
    static UI ui = new UI();

    boolean hasBattery(int batteryCheck) {
        if (batteryLife - batteryCheck > 0) {
            return true;
        } else {
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
        if (hasBattery(10)) {

            Contacts contact = new Contacts(crt, number, fName, lName);
            ui.uiAddedContactMessage(contact);
            memory.addContact(contact);
            drainBattery(10);
        }
    }

    public void listContacts() {
        if (hasBattery(10)) {
            memory.listContacts();
            drainBattery(10);
        }
    }

    public void sendMessage(String number, String text) {
        if (hasBattery(10) || text.length() < 500) {
            ui.messageSending(number, text);
            memory.sendMessage(number, text);
            drainBattery(10);
        }
    }

    public void listMessages(String number) {

        if (hasBattery(10)) {
            memory.listMessage(number);
            drainBattery(10);
        }

    }

    public void call(String number) {
        if (hasBattery(10)) {
            ui.callingMessage(number);
            memory.call(number);
            drainBattery(10);
        }
    }

    public void viewHistory() {

        if (hasBattery(10)) {
            memory.viewHistory();
            drainBattery(10);
        }

    }

}




