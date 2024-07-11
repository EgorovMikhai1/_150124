package org.example._2024_07_10.jsonYMLxml.yaml.taski;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Course {
    private String id;
    private String title;
    private int credits;
    private String professor;
    private List<String> topics;
}