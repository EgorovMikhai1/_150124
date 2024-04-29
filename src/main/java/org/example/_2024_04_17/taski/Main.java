package org.example._2024_04_17.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public int fibRec(int index) {
        if(index == 0) {
            return 0;
        }

        return index == 1 ? 1 : fibRec(index - 1) + fibRec(index - 2);
    }

   // Find circles with radius equal to any triangle side:
    public static Map<Circle, Triangle> findCirclesWithRadiusEqualToTriangleSide(List<Figure> figures) {
        Map<Circle, Triangle> result = new HashMap<>();
        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();

        for (Figure figure : figures) {
            if (figure instanceof Circle) {
                circles.add((Circle) figure);
            }

            if (figure instanceof Triangle) {
                triangles.add((Triangle) figure);
            }
        }

        for (Circle circle : circles) {
            for (Triangle triangle : triangles) {
                int a = triangle.getA();
                int b = triangle.getB();
                int c = triangle.getC();

                int radius = circle.getRadius();

                if(radius == a || radius == b || radius == c){
                    result.put(circle, triangle);
//                } else {
//                    result.put(circle, false);
                }
            }
        }
        System.out.println(result.size());
        return result;
    }



    public static void main(String[] args) {
        System.out.println(findCirclesWithRadiusEqualToTriangleSide(FigureGenerator.generateFigures()));
    }
}

@ToString
class Figure {

}

@ToString
@AllArgsConstructor
@Getter
class Rectangle extends Figure {
    private Color color;
    private int a;
    private int b;
}

@ToString
@AllArgsConstructor
@Getter
class Triangle extends Figure {
    private Color color;
    private int a;
    private int b;
    private int c;
}

@ToString
@AllArgsConstructor
@Getter
class Circle extends Figure {
    private Color color;
    private int radius;
}

@ToString
enum Color {
    RED, BLACK, WHITE, BLUE, GREEN, YELLOW, ORANGE, PINK, PURPLE, MULTICOLOR
}
