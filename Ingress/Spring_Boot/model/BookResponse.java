package az.aladdin.paymentservice.model;

public class BookResponse {
    private String id;
    private String bookName;
    private int releaseYear;

    public BookResponse(String id, String bookName, int releaseYear) {
        this.id = id;
        this.bookName = bookName;
        this.releaseYear = releaseYear;
    }

    public BookResponse() {
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
}
