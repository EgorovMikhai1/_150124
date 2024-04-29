package org.example._2024_04_29;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@ToString
public class Templ implements Comparable<Templ>{
    int param1;
    int param2;
    int param3;

    public Templ(int param1, int param2, int param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    @Override
    public int compareTo(Templ o) {
        return this.param1 - o.param1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Templ templ = (Templ) o;
        return param1 == templ.param1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(param1);
    }

    public static void main(String[] args) {
        Map<Templ, Integer> map = new HashMap<>();

        Templ templ = new Templ(1, 2, 3);
        Templ templ1 = new Templ(1, 3, 5);
        map.put(templ, 1);
        map.put(templ1, 2);

        System.out.println(map);

    }
}
