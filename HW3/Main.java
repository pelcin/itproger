package com.itprogerJava;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите логи: ");
        String login = scanner.nextLine();
        System.out.print("Введите возраст: ");
        byte age = scanner.nextByte();
        System.out.print("Введите хобби через запятую: ");
        String hobby_1 = scanner.nextLine();
        String hobby = scanner.nextLine();


        try {
            FileOutputStream fos = new FileOutputStream("ser.itproger");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(hobby);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("ser.itproger");
            ObjectInputStream ois = new ObjectInputStream(fis);

            User[] hobby1 = (User[]) ois.readObject();

            System.out.println(Arrays.toString(hobby1));

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
