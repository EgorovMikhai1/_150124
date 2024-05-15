package org.example._2024_05_15.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Participant {
    private String name;
    private int age;
}

class Pupil extends Participant {

    public Pupil(String name, int age) {
        super(name, age);
    }
}

class Teenager extends Participant {

    public Teenager(String name, int age) {
        super(name, age);
    }
}

class Adult extends Participant {

    public Adult(String name, int age) {
        super(name, age);
    }
}