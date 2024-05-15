package org.example._2024_05_15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class Param4 {
    public static void main(String[] args) {

    }
}

@Getter
@ToString
@AllArgsConstructor
class Pair<V1> {
    private V1 v1;

    public V1 get(V1 v) {
        return v;
    }
}