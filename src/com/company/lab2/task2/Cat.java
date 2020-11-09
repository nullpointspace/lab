package com.company.lab2.task2;

public class Cat extends Animal {

    private String one;

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat животное спит");
    }
}
