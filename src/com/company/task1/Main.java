package com.company.task1;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("1", "1", 1.0f);
        Phone phone2 = new Phone("2", "2", 1.0f);
        Phone phone3 = new Phone("3", "3", 1.0f);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("1");
        phone2.receiveCall("2");
        phone3.receiveCall("3");

        phone1.receiveCall("1", "1");
        phone2.receiveCall("2", "2");
        phone3.receiveCall("3", "3");

        phone1.sendMessage("1", "2","3");
    }
}