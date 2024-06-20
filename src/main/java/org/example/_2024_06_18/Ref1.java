package org.example._2024_06_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ref1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("org.example._2024_06_18.Human");

//        Constructor<Human> constructor = clazz.getConstructor();
//
//        Human human = constructor.newInstance(1, "Nik", "bic", 12345.67);
//        System.out.println(human);

        Constructor constructor = clazz.getConstructor(int.class, String.class, String.class, double.class);
        Object object = constructor.newInstance(1, "John", "Doe", 1.0);

        System.out.println(object);

        Method method = clazz.getMethod("setSalary", double.class);
        method.invoke(object, 11111.0);

        System.out.println(object);

        System.out.println("/////////////////////////////////////////////////////////////////////////");

//        Human human = new Human(2, "John", "Doe");
//        Field field = clazz.getDeclaredField("salary");
//
//        field.setAccessible(true);
//
//        double newSalary = (double) field.get(human);
//        System.out.println(newSalary);








//        Field field = clazz.getField("id");
//        System.out.println(field);
        System.out.println("******************************************************");

        Field[] fields = clazz.getFields();
//        System.out.println(Arrays.toString(fields));
        System.out.println("******************************************************");

        Field[] fields1 = clazz.getDeclaredFields();
//        System.out.println(Arrays.toString(fields1));

//        Method method = clazz.getMethod("increaseSalary");
//        System.out.println("NAME: " + method.getName());

        Method[] methods = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

//        int a = 0x000123;
//        int b = a >> 1;
//        System.out.println(b);


    }
}
