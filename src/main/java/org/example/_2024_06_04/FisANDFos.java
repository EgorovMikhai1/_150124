package org.example._2024_06_04;

import java.io.*;

public class FisANDFos {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("img.png");
             FileOutputStream outputStream = new FileOutputStream("newPng2.png")) {

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
