package org.example._2024_03_26;

public class Animal {
}

class WildAn extends Animal {

}

class HomeAn extends Animal {

}

class Cat extends HomeAn {

}

class Wolf extends WildAn {

}

class Ramiz {

    public void get(HomeAn homeAn) {
        System.out.println(homeAn);
    }

    public static void main(String[] args) {
        Animal animal = new Wolf();
        HomeAn homeAn = new HomeAn();
        Cat cat = new Cat();

        new Ramiz().get(cat);

    }
}


