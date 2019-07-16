package com.rushware.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

  public List<Book> getAllBooks() {

    // Create a list of 5 books
    Book book1 = Book.builder()
        .title("The Walking Drum")
        .author("Louis L'Amour")
        .publisher("Bantam Books")
        .copyright("1984")
        .build();
    Book book2 = Book.builder()
        .title("Our Southern Highlanders")
        .author("Horace Kephart")
        .publisher("Outing Publishing Company")
        .copyright("1913")
        .build();
    Book book3 = Book.builder()
        .title("Proficient Motorcycling")
        .author("David Hough")
        .publisher("Bowtie Press")
        .copyright("1990")
        .build();
    Book book4 = Book.builder()
        .title("Freedom of the Will")
        .author("Jonathan Edwards")
        .publisher("Yale")
        .copyright("1754")
        .build();
    Book book5 = Book.builder()
        .title("Hands-On Machine Learning")
        .author("Aurelien Geron")
        .publisher("O'Reilly")
        .copyright("2019")
        .build();

    List<Book> books = new ArrayList<>();
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);

    return books;
  }
}
