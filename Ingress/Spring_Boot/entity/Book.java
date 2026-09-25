package az.aladdin.paymentservice.entity;

import java.util.Objects;

public class Book {
    private String id;
    private String bookName;
    private int releaseYear;

    public Book(String id, String bookName, int releaseYear) {
        this.id = id;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear && Objects.equals(id, book.id) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, releaseYear);
    }
}
