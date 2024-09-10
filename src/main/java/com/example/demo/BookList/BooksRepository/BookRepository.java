package com.example.demo.BookList.BooksRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BookList.Books.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}

