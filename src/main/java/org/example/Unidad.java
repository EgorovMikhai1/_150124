package org.example;

import java.util.*;

public class Unidad  {
    int a;
    String b;
}

class Main {
    public <T> void get(Comparable<T> comparable) {

    }

    public static void main(String[] args) {

        Set<Unidad> set = new TreeSet<>(new OComparator());
        set.add(new Unidad());
        set.add(new Unidad());
        set.add(new Unidad());
        set.add(new Unidad());
    }
}


class OComparator implements Comparator<Unidad> {

    @Override
    public int compare(Unidad o1, Unidad o2) {
        return o1.a - o2.a;
    }
}