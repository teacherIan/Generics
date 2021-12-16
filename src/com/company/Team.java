package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {

    String name;

    public Team(String name) {
        this.name = name;
    }

    private int win = 0;
    private int losses = 0;
    private int tied = 0;

    ArrayList<T> members = new ArrayList<>();

    public int getAmountOfPlayers() {
        return members.size();
    }


    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println("Player already exists");
            return false;
        } else {
            members.add(player);
            return true;
        }
    }
}
