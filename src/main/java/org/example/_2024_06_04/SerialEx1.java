package org.example._2024_06_04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.*;

public class SerialEx1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Nik", 25, 1234.25);
        Employee employeeTest = new Employee("Nik", 25, 1234.25);

        Employee newEmployee = null;

        System.out.println("Before SER: " + employee);

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
        System.out.println("EQUALS: " + newEmployee.equals(employee));
        System.out.println("EQUALS TEST: " + employeeTest.equals(employee));

    }
}

@AllArgsConstructor
@Getter
@ToString
class Employee implements Serializable {
    private String name;
    private int age;
    private double salary;

}