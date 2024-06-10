package org.example._2024_06_10;

import java.util.ArrayList;
import java.util.List;

public class ServiceList {
    private List<String> list = new ArrayList<>();

    public void addItem(String item) {
        list.add(item);
    }

    public void addDoubleItem(String item) {
        list.add(item);
        list.add(item);
    }

    public List<String> getList() {
        return list;
    }
}
