package org.example._2024_05_31;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//txt
public class IOEx {
    public static void main(String[] args) {
        String text = "De conseguir el acceso a la misma, el Barça sólo podría jugar la Supercopa " +
                "superando al Madrid en su serie semifinal o organizando la competición.";
//        try {
//            FileReader fileReader = new FileReader("222.txt");
//            int character;
//            while ((character = fileReader.read()) != -1) {
//                System.out.print((char) character);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        try (FileWriter fileWriter = new FileWriter("write.txt", true)) {
            for (int i = 0; i < text.length(); i++) {
                fileWriter.write(text.charAt(i));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
