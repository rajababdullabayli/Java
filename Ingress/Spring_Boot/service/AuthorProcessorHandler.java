package az.aladdin.paymentservice.service;

import az.aladdin.paymentservice.entity.Author;
import az.aladdin.paymentservice.mapper.AuthorMapper;
import az.aladdin.paymentservice.model.AuthorRequest;
import az.aladdin.paymentservice.model.AuthorResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorProcessorHandler implements AuthorProcessor {

    public List<Author> authors = new ArrayList<>();

    @Override
    public AuthorResponse creatAuthor(AuthorRequest request) {
        var author = AuthorMapper.mapToAuthor(request);
        authors.add(author);
        return AuthorMapper.mapToAuthorResponse(author);
    }

    @Override
    public AuthorResponse getAuthorID(String id) {
        Optional<Author> optionalAuthor = authors.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();

        if (optionalAuthor.isPresent()) {
            var author = optionalAuthor.get();
            return AuthorMapper.mapToAuthorResponse(author);
        } else {
            return null;
        }
    }
}
