package org.example._2024_05_13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number: ");

            try {
                int number = sc.nextInt();
                System.out.println("You entered: " + number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("It's not a number");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
