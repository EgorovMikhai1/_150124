package org.example._2024_04_08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentSystem {

    private final String type;


    public static void main(String[] args) {
//        PaymentSystem ps1 = new PaymentSystem("VISA");
//        PaymentSystem ps2 = new PaymentSystem("WWWWWWW");
        PS type0 = PS.VISA;
        String ordinalType0 = type0.ordinal;

        String exampleForRamiz = PS.AMERICAN_EXPRESS.ordinal;
        System.out.println(ordinalType0);

        PS[] values = PS.values();

        for (PS ps : values) {
            System.out.println(ps);
        }
    }
}

enum PS {
    VISA("0"),
    MASTER_CARD("1"),
    AMERICAN_EXPRESS("2"),
    MIR("3"),
    UNI_STREAM("4"),
    UNION_PAY("5");

    String ordinal;

    PS(String ordinal) {
        this.ordinal = ordinal;
    }
}