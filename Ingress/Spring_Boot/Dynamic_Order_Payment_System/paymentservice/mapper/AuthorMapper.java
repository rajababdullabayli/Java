package az.rajab.paymentservice.mapper;

import az.rajab.paymentservice.entity.Author;
import az.rajab.paymentservice.model.AuthorRequest;
import az.rajab.paymentservice.model.AuthorResponse;

public class AuthorMapper {

    public static AuthorResponse mapToAuthorResponse(Author author){
        var authorResponse = new AuthorResponse();
        authorResponse.setAuthorName(author.getAuthorName());
        authorResponse.setBookCount(author.getBookCount());
        authorResponse.setId(author.getId());
        return authorResponse;
    }

    public static Author mapToAuthor(AuthorRequest authorResponse){
        Author author = new Author();
        author.setAuthorName(authorResponse.getAuthorName());
        author.setBookCount(authorResponse.getBookCount());
        author.setId(authorResponse.getId());
        return author;
    }
}
