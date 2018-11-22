package com.company;
 class UI {
     void uiListContacts() {
        System.out.println("Your Contacts:");
    }

    void uiAddedContactMessage(Contacts contact){
            System.out.println("Adding to contacts: "+contact.getNumber()+"| "+contact.getfName()+"| "+contact.getlName());
}
 void messageSending(String number, String text){
    System.out.println("=Sending text message=");
    System.out.println("Phone number: "+number);
    System.out.println("Text: "+text);
}
 void callingMessage(String number){
    System.out.println("=You are calling: "+number);
}

void uiListMessages(String number) {
        System.out.println("Your messages for "+number+":");
    }

}
