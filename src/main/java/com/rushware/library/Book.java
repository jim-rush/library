package com.rushware.library;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class Book {
  private String title;
  private String author;
  private String publisher;
  private String copyright;
}
