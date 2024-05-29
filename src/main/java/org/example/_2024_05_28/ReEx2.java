package org.example._2024_05_28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx2 {
    public static void main(String[] args) {
        String bankCardData = "36215478852321453122988";

        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";
        Pattern pattern =
                Pattern.compile(regex);

        Matcher matcher =
                pattern.matcher(bankCardData);

        String bc =
                matcher.replaceAll("CARD NUMBER: $1 $2 $3 $4 EXPIRATION DATE: $5/$6  CVV: $7");

        System.out.println(bc);
    }
}