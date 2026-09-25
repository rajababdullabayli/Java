package az.rajab.paymentservice.entity;

import java.util.Objects;

public class Author {

    private String id;
    private String authorName;
    private int bookCount;

    public Author(String id, String authorName, int bookCount) {
        this.id = id;
        this.authorName = authorName;
        this.bookCount = bookCount;
    }

    public Author() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return bookCount == author.bookCount && Objects.equals(id, author.id) && Objects.equals(authorName, author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, authorName, bookCount);
    }
}
