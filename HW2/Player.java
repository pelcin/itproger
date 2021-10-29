package com.itprogerJava;

import java.util.ArrayList;

public class Player {
    private  String name;
    private VARIANTS choice;

    public Player() {
        //данные для бота
        this.name = "Bot";
        this.choice = getRandom();
    }

    public Player(VARIANTS choice, String name){
        //данные для игрока
        this.name = name;
        this.choice = choice;
    }

    public VARIANTS getRandom(){
        //метод рандом для бота
        int x = (int) (Math.random() * 3);
        switch (x) {
            case 0:
                return VARIANTS.ROCK;
            case 1:
                return VARIANTS.PAPER;
            default:
                return VARIANTS.SCISSORS;
        }
    }

    public String whoWins(Player firstPlayer, Player secondPlayer){
        ArrayList<VARIANTS> array = new ArrayList<VARIANTS>();
        array.add(VARIANTS.ROCK);
        array.add(VARIANTS.PAPER);
        array.add(VARIANTS.SCISSORS);

        int index1 = array.indexOf(firstPlayer.choice);
        int index2 = array.indexOf(secondPlayer.choice);

        if (index1 == index2) {
            return "Ничья";
        }
        if ((index1 - index2) == 1 || (index1 - index2) == -2) {
            return "Победил игрок с именем: "+ firstPlayer.name;
        } else {
            return "Победил игрок с именем: " + secondPlayer.name;
        }
    }


}
