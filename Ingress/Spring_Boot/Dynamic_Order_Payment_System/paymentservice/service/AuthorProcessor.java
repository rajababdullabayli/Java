package az.rajab.paymentservice.service;

import az.rajab.paymentservice.entity.Author;
import az.rajab.paymentservice.model.AuthorRequest;
import az.rajab.paymentservice.model.AuthorResponse;

public interface AuthorProcessor {

    AuthorResponse creatAuthor(AuthorRequest authorRequest);

    Author getAuthorID(String id);
}
