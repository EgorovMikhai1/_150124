package org.example._2024_07_09;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @Column(name = "author_id")
    private int id;

    @Column(name = "name")
    private String name;
}