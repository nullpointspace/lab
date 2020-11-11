package com.company.lab4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static final String folderPatch = "Accounts";

    public static void main(String[] args) {
        checkOrCreateAccounts();
        AccountService accountService = new AccountServiceImpl();

        Scanner scanner = new Scanner(System.in);
        stop:
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(" ");
            switch (data[0]) {
                case "balance":
                    accountService.balance(Integer.parseInt(data[1]));
                    break;
                case "withdraw":
                    accountService.withdraw(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                case "deposite":
                    accountService.deposit(Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                    break;
                case "transfer":
                    accountService.transfer(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
                    break;
                case "stop": break stop;
                default:
                    System.out.println("Неверная команда");
            }
        }
    }

    private static void checkOrCreateAccounts() {
        File folder = new File(folderPatch);
        if (!folder.exists()) {
            folder.mkdir();
            for (int i = 0; i < 10; i++) {
                try (FileWriter writer = new FileWriter(folderPatch + "/" + i)) {
                    writer.write(i + ";test;0");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}