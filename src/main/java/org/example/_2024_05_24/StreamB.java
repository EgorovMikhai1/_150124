package org.example._2024_05_24;

import java.util.*;

public class StreamB {
    public int getMulti10(RedInter redInter) {
        return redInter.getMulti10(10) * 10;
    }

    public int getRandomSum(int b) {
        return b + new Random().nextInt(155);
    }

    public static void main(String[] args) {
        StreamB streamB = new StreamB();
        int a = 10;
        int b = 22;

        int getMulti = streamB.getMulti10(new RedInterImpl());

        List<Integer> list = new List<Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Integer get(int index) {
                return 0;
            }

            @Override
            public Integer set(int index, Integer element) {
                return 0;
            }

            @Override
            public void add(int index, Integer element) {

            }

            @Override
            public Integer remove(int index) {
                return 0;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }

            @Override
            public List<Integer> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };
    }
}

@FunctionalInterface
interface RedInter {
    int getMulti10(int a);
}

class RedInterImpl implements RedInter {

    @Override
    public int getMulti10(int a) {
        return a + 10;
    }
}
