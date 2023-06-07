package com.dineshonjava.myapp.model.author;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "authors")
public class Author {

    @Id
    private int authorId;

    private String name;

    private String email;
}