package az.rajab.paymentservice.mapper;

import az.rajab.paymentservice.entity.Book;
import az.rajab.paymentservice.model.BookRequest;
import az.rajab.paymentservice.model.BookResponse;

public class BooKMapper {

    public static BookResponse mapToBookResponse(Book book){
        var  bookResponse = new BookResponse();
        bookResponse.setBookName(book.getBookName());
        bookResponse.setReleaseYear(book.getReleaseYear());
        bookResponse.setId(book.getId());
        return bookResponse;
    }

    public static Book mapToBook(BookRequest bookResponse){
        var  book = new Book();
        book.setId(bookResponse.getId());
        book.setBookName(bookResponse.getBookName());
        book.setReleaseYear(bookResponse.getReleaseYear());
        return book;
    }
}
