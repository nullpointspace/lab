package com.company.lab2.task2;

public class Horse extends Animal {

    private String three;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse животное спит");
    }
}
