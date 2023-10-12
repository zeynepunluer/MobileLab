package com.example.mobileapplication2;

public class Animal {
    private String type;
    private  int picId;

    public Animal(String type, int picId) {
        this.type = type;
        this.picId = picId;
    }

    public String getType() {
        return type;
    }
    public int getPicId(){
        return picId;
    }

    public void setType(){
        this.type = type;
    }
    public void setPicId(){
        this.picId = picId;
    }
}
