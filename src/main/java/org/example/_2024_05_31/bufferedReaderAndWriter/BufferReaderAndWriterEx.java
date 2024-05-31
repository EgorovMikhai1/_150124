package org.example._2024_05_31.bufferedReaderAndWriter;

import java.io.*;

//для работы с текстовыми файлами
public class BufferReaderAndWriterEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("222.txt"));
             BufferedWriter writer
                     = new BufferedWriter(new FileWriter("text.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}