package com.company.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
            new Cat("food1", "location1"),
            new Dog("food2", "location2"),
            new Horse("food3", "location3")
        };

        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}