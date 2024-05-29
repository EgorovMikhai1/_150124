package org.example._2024_05_28;

import lombok.AllArgsConstructor;

public class ReEx3 {
    public void info(Info info) {
        System.out.printf("%02 \t %-5s \t %-5s \t %,.1f",
                info.id, info.name, info.surname, info.salary);
    }

    public static void main(String[] args) {
        Info info = new Info(1, "Name", "Sur", 12345.6897f);
        new ReEx3().info(info);
    }
}

class Info {
    int id;
    String name;
    String surname;
    float salary;


    public Info(int id, String name, String surname, float salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;

    }
}
