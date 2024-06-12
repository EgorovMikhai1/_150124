package org.example._2024_06_11;

import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("po").filter(el -> el.startsWith("!"));
        Optional<String> optionalS1 = Optional.empty();
        Optional<String> optionalS2 = Optional.ofNullable(null);

    }
}
