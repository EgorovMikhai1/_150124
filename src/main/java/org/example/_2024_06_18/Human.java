package org.example._2024_06_18;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Human {
    public int id;
    public String name;
    public String department;

    @Getter
    @Setter
    private double salary = 123.00;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Human(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("DEPARTMENT CHANGED");
    }

    public void increaseSalary() {
        salary *= 1.2;
    }
}
