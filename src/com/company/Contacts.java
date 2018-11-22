package com.company;
class Contacts {
    String crt;
    String number;
    String fName;
    String lName;

    Contacts(String crt, String number, String fName, String lName) {
        this.crt = crt;
        this.number = number;
        this.fName = fName;
        this.lName = lName;
    }

    void listContacts() {
        System.out.println(crt +" | "+ number+" | " + fName+" | " + lName);
    }

    String getfName() {
        return fName;
    }

    String getlName() {
        return lName;
    }

    String getNumber() {
        return number;
    }
}
