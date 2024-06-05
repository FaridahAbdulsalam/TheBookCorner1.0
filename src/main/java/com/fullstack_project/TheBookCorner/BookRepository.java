package com.fullstack_project.TheBookCorner;

import com.fullstack_project.Author.Author;
import com.fullstack_project.Genres.Genres;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class BookRepository {
    private final List<Book> books = new ArrayList<>();

    //CREATE
    //add a new book entry
    public void addBook(Book book){
        books.add(book);
    }

    //READ

    //get all books
    public List<Book> getAllBooks(){
        return books;
    }

    //get book by id
    public Book getBookById(long id){
        for(Book book : books){
            if (book.getId() == id){
                return book;
            }
        }
        return null;
    }

    //get a random book (maybe have a shuffle button that helps you pick what to read next)
    public Book getRandomBook() {
        Random random = new Random();
        return books.get(random.nextInt(books.size()));
    }


    //get books by Title
    public Book getBookByTitle(String title){
        for(Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    //get books by Author
    public List<Book> getBookByAuthor(Author author){
        List<Book> booksByAuthor = new ArrayList<>();
        for(Book book : books){
            if (book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    //get books by genre
    public List<Book> getBookByGenre(Genres genre){
        List<Book> booksByGenre = new ArrayList<>();
        for(Book book : books){
            if (book.getGenres().contains(genre)){
                booksByGenre.add(book);
            }
        }
        return booksByGenre;
    }

    //get books by publication date (year filter)
    public List<Book> getBooksByPublishingDate(int year){
        List<Book> booksByYear = new ArrayList<>();
        for(Book book : books){
            if (book.getPublicationDate().getYear() == year){
                booksByYear.add(book);
            }
        }
        return booksByYear;
    }

    //UPDATE

    //but only for user updating ratings on their lists, maybe image
    public Book updateBook(Book newBook, int id){
        for (int i = 0; i < books.size(); i++) {
            books.set(i, newBook);
            return newBook;
        }
        return newBook;
    }

    //DELETE
    public boolean deleteBookById(long id){
        return books.removeIf(a -> a.getId() == id);
    }
}
