package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;

class Calls {
    String number;
    String date;

    Calls(String number) {
        this.number = number;

        String pattern = "HH:mm:ss // dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        date = simpleDateFormat.format(new Date());
    }

    void listCalls(){
        System.out.println("Called "+number+" at "+date);
    }


}
