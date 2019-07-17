package com.rushware.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

  @GetMapping("/")
  public String home() {
    return "It works.";
  }

  @GetMapping("/api/books")
  public List<Book> getBooks() {

    Library library = new Library();
    return library.getAllBooks();
  }
}
