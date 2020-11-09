package com.company.lab2.task2;

public class Dog extends Animal {

    private String two;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog животное спит");
    }
}
