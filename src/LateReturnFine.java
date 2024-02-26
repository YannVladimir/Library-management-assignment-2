public class LateReturnFine {
    // Fields
    private LibraryBook book;
    private int daysLate;
    private double fineAmount;
    private String librarianName;
    private int librarianEmployeeID;
    // Constructor
    public LateReturnFine(LibraryBook book, int daysLate, String librarianName, int librarianEmployeeID) {
        this.book = book;
        this.daysLate = daysLate;
        this.librarianName = librarianName;
        this.librarianEmployeeID = librarianEmployeeID;
        calculateFine();
    }

    // Getters
    public double getFineAmount() {
        return fineAmount;
    }

    // Other methods
    private void calculateFine() {
        if (daysLate <= 0) {
            fineAmount = 0.0;
        } else {
            fineAmount = 2.0 + (daysLate - 1) * 1.0;
        }
    }

    public String toString() {
        return "Fine for late return of " + book.getTitle() + " (" + daysLate + " days late): $" + fineAmount +
                " assessed by " + librarianName + " (Employee ID: " + librarianEmployeeID + ")";
    }
}
