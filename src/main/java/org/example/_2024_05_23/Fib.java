package org.example._2024_05_23;

import java.util.stream.Stream;

public class Fib {
    public static long fib(int index) {
        var result =
                Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[0], arr[1] + arr[2]})
                        .limit(index + 1)
                        .map(el -> el[0])
                        .max(Long::compareTo);
        return result.orElseThrow(IllegalArgumentException::new);
    }
}