package org.example._2024_06_05;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("222.txt", "rw");

        int a = file.read();
        System.out.println((char) a);

        a = file.read();
        System.out.println((char) a);

//        long position = file.getFilePointer();

//        String line = file.readLine();
//        System.out.println(line);

        file.seek(22);
        file.writeBytes("!!!!!!!!!!!!!");
        String line = file.readLine();
        System.out.println(line);

    }
}
