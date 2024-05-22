package module_3.lecture_1.javaTasksExamples;

import java.util.function.BiPredicate;

public class JTExample8 {
    public static void main(String[] args) {
        BiPredicate<String, Integer> predicate = (x, y) -> x.length() == y;

        System.out.println(predicate.test("Roman", 5));
        System.out.println(predicate.test("Earth", 10));
    }
}
