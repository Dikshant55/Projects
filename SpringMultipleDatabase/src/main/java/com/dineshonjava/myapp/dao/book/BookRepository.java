package com.dineshonjava.myapp.dao.book;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dineshonjava.myapp.model.book.Book;

public interface BookRepository
  extends JpaRepository<Book, Integer> { }