package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone phone1 = new SamsungGalaxyS8("123123");
        Phone phone2 = new iPhoneXPlus("123124");

        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);

        /**
         * to insert a phone choser and entire menu system.
         */

        phone1.addContact("1", "0752122432", "Alex", "Grunzo");
        phone1.addContact("2", "0758877952", "Altcineva", "Altcivanescu");
        phone1.listContacts();

        phone1.sendMessage("0752122432", "Salut, ce mai faci? (nu sta pe telefon daca conduci!)");
        phone1.call("0752122431");

        phone1.listMessages("0752122432");
        phone1.viewHistory();



    }
}
