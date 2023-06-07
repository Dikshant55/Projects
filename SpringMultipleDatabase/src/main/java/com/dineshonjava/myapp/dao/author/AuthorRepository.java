package com.dineshonjava.myapp.dao.author;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dineshonjava.myapp.model.author.Author;

public interface AuthorRepository
  extends JpaRepository<Author, Integer> { }