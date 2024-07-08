package org.example._2024_07_03;

public class Egret {
    private String color;

    public Egret() {
        this("white");
    }

    public Egret(String color) {
        color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}