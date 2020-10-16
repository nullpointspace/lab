package com.company.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.printf("Food: %s, Location: %s%n", animal.getFood(), animal.getLocation());
    }
}
