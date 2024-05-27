package org.example._2024_05_27.wasANDpeace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WP {
    public static void main(String[] args) {
        String path = "wp.txt";

        Map<String, Integer> wf = countWordFreq(path);

        wf.forEach((word, count)
                -> System.out.println("UNIQUE WORD: [" + word +
                "] COUNT: [" + count + "]"));
    }

    private static Map<String, Integer> countWordFreq(String path) {
        Map<String, Integer> map = new HashMap<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));

            for (String line : lines) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return map.entrySet()
                .stream()
                .sorted((el1, el2) -> el2.getValue().compareTo(el1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}