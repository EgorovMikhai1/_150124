package org.example._2024_03_28;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Template {

    private static double price;

    private String name;
    private int year;


    public static void main(String[] args) {
        Template template1 = new Template("N1", 2022);
        Template template2 = new Template("Q2", 2042);
        template2.toString();

        Template.price = 12345;

        System.out.println(template1);
    }
}
