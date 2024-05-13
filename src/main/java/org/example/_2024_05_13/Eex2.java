package org.example._2024_05_13;

public class Eex2 {

    public void getPositiveNumber(int a) {
        if(a<0) {
            System.out.println("negative number!!!");
        } else {
            System.out.println("positive number!!!");
        }
    }

    /**
     * @param a
     * @param b
     * @return
     * @throws DevideBy6Exception
     */
    public double divide6(double a, double b) throws DevideBy6Exception{
        if(b == 6) {
            throw new DevideBy6Exception(ErrorMessage.DIVIDE_BY_6);
        }

        return a / b;
    }

    public static void main(String[] args) {
        new Eex2().divide6(0, 6);
    }
}

class DevideBy6Exception extends RuntimeException {
    public DevideBy6Exception(String message) {
        super(message);
    }
}

class ErrorMessage {
    public static final String DIVIDE_BY_6 = "DIVIDE BY 6";
}