package com.rushware.library.controller;

import com.rushware.library.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

  @GetMapping("/")
  public String home() {
    return "It is working.";
  }

  @GetMapping("/api/books")
  public List<Book> getBooks() {

    Library library = new Library();
    return library.getAllBooks();
  }
}
