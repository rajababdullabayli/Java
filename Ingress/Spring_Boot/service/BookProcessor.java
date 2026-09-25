package az.aladdin.paymentservice.service;

import az.aladdin.paymentservice.model.BookRequest;
import az.aladdin.paymentservice.model.BookResponse;

public interface BookProcessor {

    BookResponse creatProcess(BookRequest bookRequest);

    BookResponse getBookById(String id);
}
