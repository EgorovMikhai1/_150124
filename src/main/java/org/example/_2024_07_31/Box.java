package org.example._2024_07_31;

import lombok.Getter;

@Getter
public class Box {

    //@JoinColumn(name = boll_id, ref = id)
    //@OneToOne
    private Boll boll;
}

@Getter
class Boll {

    //@OneToOne(mappedBy = ball)
    private Box box;
}