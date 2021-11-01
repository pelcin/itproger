package com.itprogerJava;

import java.util.List;

public class User {

    private String name;
    private String login;
    private byte age;
    private List<String> hobby;

    public User(){

    }

    public User (String name, String login, byte age, List<String> hobby){
        this.name = name;
        this.login = login;
        this.age = age;
        this.hobby = hobby;
    }

    String[] hobbyArr = hobby.toString().split(",");

    public String toString(){
        return "Пользователь: " + name + " с логином: " + login + ". Его возраст: " + age + " Все хобби:";
    }

    public void toArray(){
        for (int i = 0; i < hobbyArr.length; i++) {
            System.out.println(hobbyArr[i]);
    }
}
}
