import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    // Defining fields that i will use
    private String name;
    private int id;
    private List<LibraryBook> checkedOutBooks;

    // Constructor
    public LibraryMember(String name, int id) {
        this.name = name;
        this.id = id;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<LibraryBook> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    // Other methods
    public void checkOutBook(LibraryBook book) {
        if (book.isAvailable()) {
            checkedOutBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " checked out: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available for checkout.");
        }
    }

    public void returnBook(LibraryBook book) {
        if (checkedOutBooks.contains(book)) {
            checkedOutBooks.remove(book);
            book.setAvailable(true);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println("Error: " + name + " did not check out " + book.getTitle() + ".");
        }
    }
}
