package com.company.lab4;

public class Account {
    int id;
    String holder;
    int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account(int id, String holder, int amount) {
        this.id = id;
        this.holder = holder;
        this.amount = amount;
    }
}
