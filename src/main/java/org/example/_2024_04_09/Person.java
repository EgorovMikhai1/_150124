package org.example._2024_04_09;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private String surName;
    private int age;
    private double salary;

    private Event event;

    //person1-> this.equals(person2 -> o)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age
                && Double.compare(salary, person.salary) == 0
                && Objects.equals(name, person.name)
                && Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}