import java.util.ArrayList;

public class Library {
    private ArrayList<BorrowableItems> borrowableItemsList = new ArrayList<>();

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equals(title) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Checked out: " + title);
                    return;
                }
            }
        }
        System.out.println("Item not available or not found.");
    }

    public void listAvailableItems() {
        System.out.println("Available library items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Total items: " + borrowableItemsList.size() + ", Available items: " + availableCount);
    }
}

