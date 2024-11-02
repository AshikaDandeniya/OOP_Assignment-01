public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        System.out.println("Library Information:");
        library.displayLibraryInfo();

        System.out.println("\nListing available items:");
        library.listAvailableItems();

        System.out.println("\nChecking out 'Island of a Thousand Mirrors'...");
        library.checkoutItem("Island of a Thousand Mirrors");

        System.out.println("\nListing available items after checkout:");
        library.listAvailableItems();
    }
}

