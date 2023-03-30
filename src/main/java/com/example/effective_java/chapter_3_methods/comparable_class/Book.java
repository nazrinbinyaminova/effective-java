package com.example.effective_java.chapter_3_methods.comparable_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Comparable<Book> {
    private String name;
    private Integer page;

    private static final Comparator<Book> COMPARATOR =
            Comparator.comparingInt(Book::getPage)
                    .thenComparing(Book::getName);

    @Override
    public int compareTo(Book o) {
        return COMPARATOR.compare(this, o);
    }
}
