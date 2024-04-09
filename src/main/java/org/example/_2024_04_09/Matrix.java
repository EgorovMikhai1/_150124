package org.example._2024_04_09;

public class Matrix {

    //todo
    /**
     *
     * @param matrix матрица в которой все числа отсортированы справа налево и сверху вниз
     * @param number число которое ищем
     * @return true - если число есть матрице
     */
    public boolean isConsistNumber(int[][] matrix, int number) {
        return true;
    }

    public static void main(String[] args) {
//        int[] array = {12, 34, 56, 7, 89};
//
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(array[i]);
//        }

        System.out.println("*******************************************************");


        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
