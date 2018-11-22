package com.company;

public class iPhoneX extends iPhone {

    String model;
    String imei;


    public iPhoneX(String imei) {
        this.imei=imei;
        this.model = "iPhoneX";
        String material = "iPhoneX premium materials";
    }

    iPhoneX() {
    }
}
