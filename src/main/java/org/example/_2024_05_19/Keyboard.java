package org.example._2024_05_19;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Keyboard implements Comparable<Keyboard>, Serializable {
    private String brand;
    private float price;
   // private P port;

    public Keyboard() {
    }

    public Keyboard(String brand, float price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public <P extends USBport> void connect(List<P> list) {
        System.out.println(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard = (Keyboard) o;
        return Float.compare(price, keyboard.price) == 0 && Objects.equals(brand, keyboard.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Keyboard o) {
        return (int) (this.price - o.price);
    }
}

class USBport {

}

class TypeC extends USBport {

}

class VGA extends USBport {

}