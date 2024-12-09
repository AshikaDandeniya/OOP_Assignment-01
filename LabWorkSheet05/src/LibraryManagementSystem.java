import library.books.FictionBook;
import library.utils.BookUtils;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("Madol Duwa", "Martin Wickramasinghe", "Classic");
        BookUtils.printBookDetails(fictionBook);
    }
}
