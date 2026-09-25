package az.rajab.paymentservice.service;

import az.rajab.paymentservice.entity.Book;
import az.rajab.paymentservice.mapper.BooKMapper;
import az.rajab.paymentservice.model.BookRequest;
import az.rajab.paymentservice.model.BookResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookProcessorHandler implements BookProcessor {

    public List<Book> books = new ArrayList<>();

    @Override
    public BookResponse creatProcess(BookRequest request) {
        var book = BooKMapper.mapToBook(request);
        books.add(book);
        return BooKMapper.mapToBookResponse(book);
    }

    @Override
    public BookResponse getBookById(String id) {
        Optional<Book> optionalBook = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();

        if (optionalBook.isPresent()) {
            var book = optionalBook.get();
            return BooKMapper.mapToBookResponse(book);
        } else {
            return null;
        }
    }
}
