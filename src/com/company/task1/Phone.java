package com.company.task1;

public class Phone {
    private String number;
    private String model;
    private Float weight;

    public Phone(String number, String model, Float weight) {
        this(model, weight);
        this.number = number;
    }

    public Phone(String model, Float weight) {
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.printf("Звонит %s%n", name);;
    }

    public void receiveCall(String name, String number){
        System.out.printf("Звонит %s%n, номер: %s", name, number);;
    }

    public void sendMessage(String... numbers){
        for (String s : numbers) {
            System.out.println(s);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public Float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
