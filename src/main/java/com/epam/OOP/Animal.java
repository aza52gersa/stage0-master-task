package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String result;
        if (hasFur) {
            return System.out.printf("This animal is mostly %s. It has %d paws and a fur." , color, numberOfPaws).toString();
        } else {
            return System.out.printf("This animal is mostly %s. It has %d paws and no fur." , color, numberOfPaws).toString();
        }
    }
}
