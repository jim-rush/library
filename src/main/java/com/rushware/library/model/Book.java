package com.rushware.library.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
  private String title;
  private String author;
  private String publisher;
  private String copyright;
}
