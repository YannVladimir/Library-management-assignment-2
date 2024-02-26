public class TestLibraryLateReturn {
    public static void main(String[] args) {
        // Test cases
        LibraryBook book1 = new LibraryBook("Book1", "Author1", Genre.Mystery);
        LibraryMember member1 = new LibraryMember("Member1", 1);
        Librarian librarian = new Librarian("Librarian1", 1001);

        // Book Returned On Time
        System.out.println("\nTest Case: Book Returned On Time");
        member1.checkOutBook(book1);
        member1.returnBook(book1);

        // Book Returned Late - Fine Calculation
        System.out.println("\nTest Case: Book Returned Late - Fine Calculation");
        member1.checkOutBook(book1);
        // Simulate returning the book 3 days late
        int daysLate = 3;
        LateReturnFine fine1 = librarian.assessFine(book1, daysLate);
        System.out.println(fine1);

        // Simulate returning the book precisely on the due date
        System.out.println("\nTest Case: Book Returned Precisely on the Due Date");
        member1.returnBook(book1);

        // Book Returned Less Than 1 Day Late
        System.out.println("\nTest Case: Book Returned Less Than 1 Day Late");
        member1.checkOutBook(book1);
        // Simulate returning the book 0.5 days late
        daysLate = 0;
        LateReturnFine fine2 = librarian.assessFine(book1, daysLate);
        System.out.println(fine2);

        // Book Returned More Than 1 Day Late
        System.out.println("\nTest Case: Book Returned More Than 1 Day Late");
        member1.checkOutBook(book1);
        // Simulate returning the book 5 days late
        daysLate = 5;
        LateReturnFine fine3 = librarian.assessFine(book1, daysLate);
        System.out.println(fine3);
    }
}
