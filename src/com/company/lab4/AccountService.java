package com.company.lab4;

public interface AccountService {
    void withdraw(int accountId, int amount);
    void balance(int accountId);
    void deposit(int accountId, int amount);
    void transfer(int from, int to, int amount);
}
