package com.Exam.Library;

import java.util.HashMap;
import java.util.Map;

public class TestLibrary {
    public static void main(String[] args) {
        Map<Integer, Book> addBook = new HashMap<>();
        // ADD
        addBook.put(1, new Book("1948", "book1", true));
        addBook.put(2, new Book("Money", "book2", false));
        addBook.put(3, new Book("confidence", "book3", true));
        // LIST all books
        addBook.forEach((key, value) -> {
            System.out.println(value);
        });
        // System.out.println(addBook);

        // Borrow
        int borrowId = 2;
        for (Map.Entry<Integer, Book> b : addBook.entrySet()) {
            if (addBook.containsKey(borrowId)) {
                b.getValue().setTitle("1967");
                b.getValue().setIsAvailable(false);
                b.getValue().setAuthor("book1(updated)");
            }
        }
        // System.out.println(addBook);

        for (Map.Entry<Integer, Book> b : addBook.entrySet()) {
            if (b.getValue().getTitle().equalsIgnoreCase("1967")) {
                b.getValue().setIsAvailable(true);
            }
        }
        // System.out.println(addBook);

    }

}
