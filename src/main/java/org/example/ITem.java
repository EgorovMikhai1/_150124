package org.example;

import java.io.Serializable;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class ITem implements Comparable<ITem> {

    String name;
    private static String param = null;

//    public ITem(String name) {
//      List<?> list = new ArrayList();
//      List<Integer[]> list = new ArrayList();
//    }

    @Override
    public int compareTo(ITem o) {

        return 0;
    }

    int paramA;
    int paramB;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ITem iTem = (ITem) o;
        return paramA == iTem.paramA && paramB == iTem.paramB;
    }

    @Override
    public int hashCode() {
        abstract class Person implements Serializable {

            String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        class Res extends Person {

        }
        return Objects.hash(paramA, paramB);
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
//        new Object().equals(new ITem());
//
//        String name = "QQQ";
//
//        name = "WWW";
        int i  = 0;
        do {
            System.out.println("!!!!");
            i--;
        } while (i != 0);

//        while (i > 0) {
//
//        }
    }

    Intt intt = System.out::println;
}

@FunctionalInterface
interface Intt {
    void get();

    boolean equals(Object o);
}