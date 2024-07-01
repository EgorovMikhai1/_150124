package org.example;

import java.io.Serializable;
import java.util.Objects;

public class ITem implements Comparable<ITem> {
    String name;
    private static String param = null;

//    public ITem(String name) {
//
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
        new Object().equals(new ITem());

        String name = "QQQ";

        name = "WWW";
    }
}