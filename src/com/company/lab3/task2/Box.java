package com.company.lab3.task2;

public class Box<T extends Fruit> {
    private int count;
    private T object;

    public Box(int count, T object) {
        this.count = count;
        this.object = object;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public <E extends Fruit> boolean compareTo(Box<E> o) {
        return this.count * this.object.getWeight() == o.count * o.object.getWeight();
    }

    public void fuck(Box<T> box){
        this.count += box.count;
        box.count = 0;
    }
}
