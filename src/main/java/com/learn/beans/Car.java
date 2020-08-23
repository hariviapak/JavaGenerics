package com.learn.beans;

public class Car {
    private String color;
    private String model;
    private Integer number;


    public Car(String color, String model, Integer number) {
        this.color = color;
        this.model = model;
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Integer getNumber() {
        return number;
    }
}
