package com.rvittori.jpa;


import com.rvittori.jpa.domain.Author;
import com.rvittori.jpa.domain.Book;

public final class TestDataUtil {

    private TestDataUtil() {

    }


    public static Author createTestAuthorA() {
        return Author.builder()
                .name("Jane Doe")
                .age(50)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .name("Mary Jane")
                .age(30)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .name("John Doe")
                .age(25)
                .build();
    }

    public static Book createTestBookA(final Author author) {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .author(author)
                .build();
    }

    public static Book createTestBookB(final Author author) {
        return Book.builder()
                .isbn("978-1-2345-6789-1")
                .title("Beyond The Horizon")
                .author(author)
                .build();
    }

    public static Book createTestBookC(final Author author) {
        return Book.builder()
                .isbn("978-1-2345-6789-2")
                .title("The Last Ember")
                .author(author)
                .build();
    }
}
