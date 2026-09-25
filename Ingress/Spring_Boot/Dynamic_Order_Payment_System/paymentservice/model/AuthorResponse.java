package az.rajab.paymentservice.model;

import az.rajab.paymentservice.entity.Author;

public class AuthorResponse extends Author {
    private String id;
    private String authorName;
    private int bookCount;

    public AuthorResponse(String id, String authorName, int bookCount) {
        this.id = id;
        this.authorName = authorName;
        this.bookCount = bookCount;
    }

    public AuthorResponse() {
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
}
