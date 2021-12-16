package com.company;

public class Main {

    public static void main(String[] args) {

        BaseballPlayer Dan = new BaseballPlayer("Dan");
        BasketballPlayer Ian = new BasketballPlayer("Ian");
        Player Bob = new BaseballPlayer("Bob");

        Team<BasketballPlayer> BostonCeltics = new Team<>("Ian");

        BostonCeltics.addPlayer(Ian);

        System.out.println(BostonCeltics.getAmountOfPlayers());

    }
}
