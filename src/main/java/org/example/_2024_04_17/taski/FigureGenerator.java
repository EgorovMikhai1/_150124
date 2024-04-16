package org.example._2024_04_17.taski;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@UtilityClass
public class FigureGenerator {

    private static final Random RANDOM = new Random();

    public static List<Figure> generateFigures() {
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            figures.add(generateRandomFigure());
        }
        return figures;
    }

    private static Figure generateRandomFigure() {
        int figureType = RANDOM.nextInt(3);
        switch (figureType) {
            case 0:
                return generateRectangle();
            case 1:
                return generateTriangle();
            case 2:
                return generateCircle();
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    private static Rectangle generateRectangle() {
        Color color = Color.values()[RANDOM.nextInt(Color.values().length)];
        int a = 1 + RANDOM.nextInt(100);
        int b = 1 + RANDOM.nextInt(100);
        return new Rectangle(color, a, b);
    }

    private static Triangle generateTriangle() {
        Color color = Color.values()[RANDOM.nextInt(Color.values().length)];
        int a, b, c;
        do {
            a = 1 + RANDOM.nextInt(100);
            b = 1 + RANDOM.nextInt(100);
            c = 1 + RANDOM.nextInt(100);
        } while (!isValidTriangle(a, b, c));
        return new Triangle(color, a, b, c);
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static Circle generateCircle() {
        Color color = Color.values()[RANDOM.nextInt(Color.values().length)];
        int radius = 1 + RANDOM.nextInt(50);
        return new Circle(color, radius);
    }
}