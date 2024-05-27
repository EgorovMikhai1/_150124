package org.example._2024_05_27;

import jdk.jfr.Percentage;

import javax.swing.plaf.metal.MetalIconFactory;
import javax.transaction.xa.Xid;
import java.util.function.Function;

public class Carr2 {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> result
                = u -> v -> u * v;

        System.out.println("RESULT: " + result.apply(5).apply(6));
    }
}


class Carr3 {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, String>> res = a -> b -> b + "";

        res.apply(123).apply(456);

//        Function<MetalIconFactory.TreeLeafIcon, Xid>





        System.out.println("RES: " + res.apply(888));
    }
}
