package az.aladdin.paymentservice.service;

import az.aladdin.paymentservice.entity.Author;
import az.aladdin.paymentservice.model.AuthorRequest;
import az.aladdin.paymentservice.model.AuthorResponse;

public interface AuthorProcessor {

    AuthorResponse creatAuthor(AuthorRequest authorRequest);

    Author getAuthorID(String id);
}
