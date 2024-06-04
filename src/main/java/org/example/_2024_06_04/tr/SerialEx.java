package org.example._2024_06_04.tr;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialEx {
    public static void main(String[] args) {
        Employee employee = new Employee("Nik", 25, 1234.25, "");
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(employee);

            out.close();
            fileOut.close();

            System.out.println("***SERIALIZED***");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
