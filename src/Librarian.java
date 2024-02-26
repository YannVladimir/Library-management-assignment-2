public class Librarian {
    // Fields
    private String name;
    private int employeeID;

    // Constructor
    public Librarian(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    // Other methods
    public LateReturnFine assessFine(LibraryBook book, int daysLate) {
        return new LateReturnFine(book, daysLate, name, employeeID);
    }
}
