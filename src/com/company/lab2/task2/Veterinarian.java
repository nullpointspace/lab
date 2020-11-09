package com.company.lab2.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.printf("Food: %s, Location: %s%n", animal.getFood(), animal.getLocation());
    }
}
