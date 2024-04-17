package org.example.testetst.taski;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class Main {
    public static void main(String[] args) {
        System.out.println(FigureGenerator.generateFigures());
    }
}

@ToString
class Figure {

}

@ToString
@AllArgsConstructor
class Rectangle extends Figure {
    private Color color;
    private int a;
    private int b;
}

@ToString
@AllArgsConstructor
class Triangle extends Figure {
    private Color color;
    private int a;
    private int b;
    private int c;
}

@ToString
@AllArgsConstructor
class Circle extends Figure {
    private Color color;
    private int radius;
}

@ToString
enum Color {
    RED, BLACK, WHITE, BLUE, GREEN, YELLOW, ORANGE, PINK, PURPLE, MULTICOLOR
}
