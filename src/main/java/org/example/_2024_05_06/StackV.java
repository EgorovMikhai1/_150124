package org.example._2024_05_06;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

public interface StackV<T> {
    void push(T t);

    T pop();

    boolean isEmpty();
}

@ToString
class StackVImpl<T> implements StackV<T> {
    List<T> list = new ArrayList<>();

    @Override
    public void push(T t) {
        list.add(0, t);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class Main11 {
    public static void main(String[] args) {
        StackV<Integer> stackV = new StackVImpl<>();
        stackV.push(1);
        stackV.push(2);
        stackV.push(21);
        stackV.push(32);

        System.out.println(stackV);

        System.out.println(stackV.pop());
        System.out.println(stackV.pop());
    }
}