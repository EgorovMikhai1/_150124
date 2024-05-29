package org.example._2024_05_28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx1 {
    public static void main(String[] args) {
        String text = "Opa Banco Sabadell-pymes, la ‘pinza’ " +
                "que complica@gmail.com el futuro de BBVA en Cataluña";

        String str = "A23BC B ABC3DSDKF5HAB*4CHDL AB5CB4CBDH3DHF ABD AB8 ABA3DAB66WD BD";

//        Pattern pattern = Pattern.compile("ABC");
//        Pattern pattern = Pattern.compile("[ABC]");
//        Pattern pattern = Pattern.compile("AB(A|9)");
//        Pattern pattern = Pattern.compile("AB.");
//        Pattern pattern = Pattern.compile("\\W");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("POS: " + matcher.start() + " | VAL: " + matcher.group());
        }
    }
}