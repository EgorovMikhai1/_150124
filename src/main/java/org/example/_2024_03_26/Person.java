package org.example._2024_03_26;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;

    public void jump() {
        System.out.println("JUMP");
    }

//    class A {
//        public void do7() {
//            System.out.println("777");
//        }
//    }
}

class Main extends Person{



//    @Override
//    public void jump() {
//        System.out.println("MAIN JUMP");
//
//    }

    public static void main(String[] args) {
//        Person person1 = new Person("Nik", 22);
//        Object o = new Person("Obj", 99);

        new Main().jump();

        Person person = new Main();



    }
}