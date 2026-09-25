package az.rajab.paymentservice.service;

import az.rajab.paymentservice.model.BookRequest;
import az.rajab.paymentservice.model.BookResponse;

public interface BookProcessor {

    BookResponse creatProcess(BookRequest bookRequest);

    BookResponse getBookById(String id);
}
