package org.example._2024_07_10.jsonYMLxml.yaml.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class University {
    private String name;
    private List<Department> departments;
}
