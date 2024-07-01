package org.example._2024_07_01;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class Excex {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> mainPlayerList = new ArrayList<>();
        List<Action> secondPlayerList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            mainPlayerList.add(Action.values()[new Random().nextInt(Action.values().length)]);
            secondPlayerList.add(Action.values()[new Random().nextInt(Action.values().length)]);
        }

        new Player(FAKER.name().name(), mainPlayerList, exchanger);
        new Player(FAKER.name().name(), secondPlayerList, exchanger);
    }
}

enum Action {
    STONE,
    SCISSORS,
    PAPER
}

class Player extends Thread{
    private String name;
    private List<Action> actionList;
    private Exchanger<Action> exchanger;

    public Player(String name, List<Action> actionList, Exchanger<Action> exchanger) {
        this.name = name;
        this.actionList = actionList;
        this.exchanger = exchanger;
        this.start();
    }

    private void getWinner(Action player, Action opponent) {
        if(player == Action.PAPER && opponent == Action.STONE ||
           player == Action.SCISSORS && opponent == Action.PAPER ||
           player == Action.STONE && opponent == Action.SCISSORS) {
            System.out.println("THE WINNER IS: " + name);
        }
    }

    @Override
    public void run() {
        Action secondPlayerActionHolder; //хранение данных от второго потока

        for (Action mainPlayerActionHolder : actionList) {
            try {

                secondPlayerActionHolder = exchanger.exchange(mainPlayerActionHolder);
                getWinner(mainPlayerActionHolder, secondPlayerActionHolder);
                Thread.sleep(1234);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}