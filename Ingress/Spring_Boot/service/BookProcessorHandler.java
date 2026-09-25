package az.aladdin.paymentservice.service;

import az.aladdin.paymentservice.entity.Book;
import az.aladdin.paymentservice.mapper.BooKMapper;
import az.aladdin.paymentservice.model.BookRequest;
import az.aladdin.paymentservice.model.BookResponse;

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
