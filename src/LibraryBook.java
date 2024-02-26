public class LibraryBook {
    // Fields
    private String title;
    private String author;
    private Genre genre;
    private boolean available;

    // Constructor
    public LibraryBook(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
