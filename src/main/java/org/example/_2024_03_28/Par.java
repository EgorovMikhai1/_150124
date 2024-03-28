package org.example._2024_03_28;

import lombok.Getter;

@Getter
public class Par {


    private String param1;
    protected String param2;

}

class Chil extends Par {

}

class SubChil extends Chil {

}

class Temp {
    public static void main(String[] args) {
//        new  Chil().

    }
}
