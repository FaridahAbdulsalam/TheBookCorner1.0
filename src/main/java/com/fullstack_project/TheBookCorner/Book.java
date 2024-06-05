package com.fullstack_project.TheBookCorner;

import com.fullstack_project.Genres.Genres;
import com.fullstack_project.Author.Author;

import java.time.LocalDate;
import java.util.List;



public class Book {
    private long id;
    private String title;
    private Author author;
    private float rating;
    private List<Genres> genres;
    private String description;
    private LocalDate publicationDate;
    private String image;

    public Book(long id, String title, Author author, float rating, List<Genres> genres, String description, LocalDate publicationDate, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.genres = genres;
        this.description = description;
        this.publicationDate = publicationDate;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
