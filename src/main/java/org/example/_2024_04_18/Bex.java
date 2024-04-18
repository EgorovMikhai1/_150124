package org.example._2024_04_18;

public class Bex {

    private int getUnique(int[] arr) {
        int xor = 0; // 1 - 2 - 6 - 3 - 2 - 7 - 4

        for (int x : arr) {
            xor = xor ^ x;
        }

        return xor;
    }

    public static void main(String[] args) {
        int a = 4;

        int[] array = {1, 3, 4, 5, 1, 5, 3};
        /**
         * 0 0 0 0 0 0 0 0
         * 0 0 0 0 0 0 0 1
         * 0 0 0 0 0 0 0 1
         *
         * 0 0 0 0 0 0 0 1
         * 0 0 0 0 0 0 1 1
         * 0 0 0 0 0 0 1 0
         *
         * 0 0 0 0 0 0 1 0
         * 0 0 0 0 0 1 0 0
         * 0 0 0 0 0 1 1 0
         *
         * 0 0 0 0 0 1 1 0
         * 0 0 0 0 0 1 0 1
         * 0 0 0 0 0 0 1 1
         *
         *
         * 0 0 0 0 0 0 1 1
         * 0 0 0 0 0 0 0 1
         * 0 0 0 0 0 0 1 0
         *
         * 0 0 0 0 0 0 1 0
         * 0 0 0 0 0 1 0 1
         * 0 0 0 0 0 1 1 1
         *
         * 0 0 0 0 0 1 1 1
         * 0 0 0 0 0 0 1 1
         * 0 0 0 0 0 1 0 0
         */
    }
}
