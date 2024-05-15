package org.example._2024_05_15.example;

import com.github.javafaker.Faker;

public class Main {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Pupil p1 = new Pupil(FAKER.name().firstName(), 9);
        Pupil p2 = new Pupil(FAKER.name().firstName(), 9);

        Teenager t1 = new Teenager(FAKER.name().firstName(), 11);
        Teenager t2 = new Teenager(FAKER.name().firstName(), 11);

        Adult a1 = new Adult(FAKER.name().firstName(), 21);
        Adult a2 = new Adult(FAKER.name().firstName(), 21);

        Team<Pupil> pt = new Team<>(FAKER.team().name());
        Team<Teenager> tt = new Team<>(FAKER.team().name());
        Team<Adult> at = new Team<>(FAKER.team().name());

        pt.addNewParticipant(p1);
        tt.addNewParticipant(t1);
        at.addNewParticipant(a1);

//        pt.play(at);
    }
}
