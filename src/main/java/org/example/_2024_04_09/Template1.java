package org.example._2024_04_09;

public class Template1 {
    public static void main(String[] args) {
        String a = "A";
        String b = new String("A");

        Integer i1 = 5;
        Integer i2 = new Integer(5);

        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);

//        System.out.println(a.equals(b));
//        System.out.println(a == b);

        Person person1 = new Person("NIK", "SNIK", 1, 1234.45);
        Person person2 = new Person("PER2", "SPer2", 122, 12234.45);

        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
