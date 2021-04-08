package com.agenda;

public class Fone {

    public String number;

    public String id;

    public Fone() { }

    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static boolean validate(String number){
        return true;
    }
}
