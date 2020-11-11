package com.company.lab4;

import java.io.*;

public class AccountServiceImpl implements AccountService {

    @Override
    public void withdraw(int accountId, int amount) {
        try {
            Account account = loadAccount(accountId);
            if (account.getAmount() >= amount) {
                account.setAmount(account.getAmount() - amount);
            } else {
                System.out.println("Нужно больше золота");
            }
            saveAccount(account);
        } catch (IOException e) {
            System.out.println("Аккаунт не найден");
        }
    }

    @Override
    public void balance(int accountId) {
        try {
            Account account = loadAccount(accountId);
            System.out.println("Баланс: " + account.amount);
        } catch (IOException e) {
            System.out.println("Аккаунт не найден");
        }
    }

    @Override
    public void deposit(int accountId, int amount) {
        try {
            Account account = loadAccount(accountId);
            account.setAmount(account.getAmount() + amount);
            saveAccount(account);
        } catch (IOException e) {
            System.out.println("Аккаунт не найден");
        }
    }

    @Override
    public void transfer(int from, int to, int amount) {
        try {
            Account accountFrom = loadAccount(from);
            Account accountTo = loadAccount(to);
            if (accountFrom.getAmount() > amount) {
                accountFrom.setAmount(accountFrom.getAmount() - amount);
                accountTo.setAmount(accountTo.getAmount() + amount);
            } else {
                System.out.println("Нужно больше золота");
            }
            saveAccount(accountFrom);
            saveAccount(accountTo);
        } catch (IOException e) {
            System.out.println("Аккаунт не найден");
        }
    }

    private Account loadAccount(int id) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(Main.folderPatch + "/" + id))) {
            String[] data = reader.readLine().split(";");
            return new Account(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
        } catch (IOException e) {
            throw e;
        }
    }

    private void saveAccount(Account account) throws IOException {
        try (FileWriter writer = new FileWriter(Main.folderPatch + "/" + account.getId())) {
            writer.write(account.getId() + ";" + account.getHolder() + ";" + account.getAmount());
        } catch (IOException e) {
            throw e;
        }
    }
}
