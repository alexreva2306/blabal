package com.techtorial.ventraApp;

import java.util.Random;

public class VentraCard {

    /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */
//1
    private String fullName; private String phoneNumber; private String email; private long cardNumber;
//2
    public void setFullName(String fullName) {
    this.fullName = fullName;
}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = createCardNumber();
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getCardNumber() {return cardNumber;}

//3

    public VentraCard(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cardNumber = createCardNumber();

    }

    public static VentraCard createCard(String fullName, String phoneNumber, String email){

    /*
    this method needs to return VentraCard according to the parameter
     */
        return new VentraCard(fullName,phoneNumber,email);
    }

    public long createCardNumber(){
        Random random=new Random(10);
        String str ="";
        for (int i=1;i<=16;i++){
             str += random.nextInt();

        }
        /*
        this method needs to return the 16 digit card number
         */
        return Long.parseLong(str);
    }

    public static void main(String[] args) {


    }
}
