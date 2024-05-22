package module_3.lecture_2.javaTasksExamples;

import java.util.function.Function;

public class JTExample4 {
    public static void main(String[] args) {
        Function<Integer, Integer> id = Function.identity();
        System.out.println(id.apply(3));
    }
}
