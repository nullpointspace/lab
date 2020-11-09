package com.company.lab3.task1;

import java.util.Arrays;

public class ArrayList<E> {
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] array;

    public ArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        this.array = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void add(E item) {
        if (size == capacity) {
            int newCapacity = (size == 0) ? DEFAULT_CAPACITY : size * 3 / 2;
            grow(newCapacity);
        }

        size++;
        array[size] = item;
    }

    private void grow(int capacity) {
        this.capacity = capacity;
        this.array = Arrays.copyOf(this.array, capacity);
    }

    public void remove(E item) {
        if (item == null) {
            throw new NullPointerException();
        }
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (item.equals(array[i])) {
                index = i;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public void remove(int index) {
        if (index == array.length - 1) {
            array[index] = null;
            size--;
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[index] = null;
        size--;
    }

    public E get (int index){
        if (index > size || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) array[index];
    }

    public void clear(){
        this.size = 0;
        this.array = new Object[DEFAULT_CAPACITY];
    }
}

/*
1.	Создать собственную типизированную коллекцию с методами:
- int size() – возвращает размер коллекции
- void add(E item) – добавить элемент в коллекцию
- void remove(int index) – удаляет элемент по индексу
- void remove(E item) – удаляет элемент
- E get(int index) – получение элемента по индексу
- void clear() – очищает коллекцию
Необходимо создать две реализации коллекции: на основе массива и связанного списка

 */