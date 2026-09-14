package Task_1;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void  removeBookById(int id){
        for  (Book book : books){
            if (book.getId() == id){
                books.remove(book);
            }
        }
    }

    public Book findBookById(int id){
        for (Book book : books){
            if (book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks(){
        return books;
    }
}
