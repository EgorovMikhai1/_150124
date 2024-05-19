package org.example._2024_05_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Можем ли мы рассмотреть вложенные try и пояснить для чего они нужны?
 */
public class Sv2 {
    public static void main(String[] args) {

    }
}

/**
 * они аналоги много catch
 */
class MultiCatchExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
            System.out.println("Finished file operations");
        }
    }

    private static void processLine(String line) {
        System.out.println("Processing line: " + line);
    }
}
