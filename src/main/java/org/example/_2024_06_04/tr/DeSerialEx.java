package org.example._2024_06_04.tr;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialEx {
    public static void main(String[] args) {
        Employee newEmployee = null;

        try {
            FileInputStream fileInput = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileInput);

            newEmployee = (Employee) in.readObject();

            in.close();
            fileInput.close();

            System.out.println("***DE-SERIALIZED***");

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("NEW OBJECT: " + newEmployee);
    }
}