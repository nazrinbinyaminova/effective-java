package com.example.effective_java.chapter_3_methods.comparable_class;

import java.util.ArrayList;
import java.util.Collections;

public class Application {
    public static void main(String... args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", 100));
        books.add(new Book("The power of habit", 50));
        books.add(new Book("Blice in the wonderland", 10));
        books.add(new Book("Alice in the wonderland", 10));
        Collections.sort(books);
        System.out.println(books);
    }
}
