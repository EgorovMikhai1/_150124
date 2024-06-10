package org.example._2024_06_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServiceListTest {

    private static final ServiceList service = new ServiceList();
    private static final String ITEM = "i1";


    @BeforeEach
    public void setUp() {
       service.getList().clear();
       service.getList().add("!!!");
       service.getList().add("***");
       service.getList().add("///");
    }


    @Test
    void addItem() {
        service.addItem(ITEM);

        Assertions.assertEquals(4, service.getList().size());
        Assertions.assertTrue(service.getList().contains(ITEM));
    }

    @Test
    void addDoubleItemTest() {
        service.addDoubleItem(ITEM);

        Assertions.assertEquals(5, service.getList().size());
    }
}