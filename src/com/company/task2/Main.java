package com.company.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("food1", "location1");
        animals[1] = new Dog("food2", "location2");
        animals[2] = new Horse("food3", "location3");

        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}