package org.example._2024_06_04.tr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
public class Employee implements Serializable {

    @java.io.Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient double salary;

    private String surName;
}