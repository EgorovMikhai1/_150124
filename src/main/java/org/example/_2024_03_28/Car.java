package org.example._2024_03_28;



public class Car {

    private Brand brand;
    private String year;

    public Car(Brand brand, String year) {
        this.brand = brand;
        this.year = year;
    }

    public void setBrand(Brand brand) {
        checkBrand();
        this.brand = brand;
    }

    private static void checkBrand() {
        //че то там делает
    }

    public void setYear(String year) {
        this.year = year;
    }
}
