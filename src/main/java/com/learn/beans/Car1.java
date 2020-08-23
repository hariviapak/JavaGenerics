package com.learn.beans;

public class Car1 {
    private String color;
    private String model;
    private Integer number;


    public Car1(String color, String model, Integer number) {
        this.color = color;
        this.model = model;
        this.number = number;
    }


    public boolean equals(Object object){
        System.out.println("In overridden equals ");

        if((object instanceof Car1) && ((Car1) object).getNumber().equals(this.getNumber())){
            return true;
        }else{
            return false;
        }
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

