package library.utils;

import library.books.FictionBook;

public class BookUtils {
    public static void printBookDetails(FictionBook book) {
        System.out.println("Book Details:");
        book.displayInfo();
    }
}
