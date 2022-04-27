package com.floreantpos.model;

import java.util.HashMap;

public class Customer {

    String firstName = "";
    String lastName = "";

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void addProperty(String name, String value) {
    }

    public boolean hasProperty(String key){
        return key.equals("FIELD");
    }

    public String getProperty(String key){
        if (key.equals("FIELD")){
            return "TEST";
        } else if (key.equals("AGAIN")){
            return "SECOND_TEST";
        }
        return null;
    }

    @Override
    public String toString(){
        if (this.firstName.equals("")){
            return "";
        }
        return this.firstName;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public void setCity(String city){

    }

    public void setState(String state){

    }


}
