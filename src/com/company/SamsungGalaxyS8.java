package com.company;

public class SamsungGalaxyS8 extends Samsung {

    String model;
    String imei;


    SamsungGalaxyS8(String imei) {
        this.imei=imei;
        this.model = "Samsung Galaxy S8";
        String material = "S8 premium materials";
    }

    public String getModel() {
        return model;
    }

    public String getImei() {
        return imei;
    }
}
