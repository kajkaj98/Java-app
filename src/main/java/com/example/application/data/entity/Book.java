package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity(name = "books")
public class Book extends AbstractEntity {

    @Lob
    private String image;
    private String name;
    private String author;
    private LocalDate publicationDate;
    private Integer pages;
    private String currentPage;
    private String isbn;
    private String borrowed;
    private String tags;
    @ManyToOne
    private User owner;
//    @ManyToMany
//    private Set<Tag> tags;

//    @ManyToMany(
//            cascade = {CascadeType.MERGE, CascadeType.PERSIST}
//    )
//    @JoinTable(
//            name = "books_tags",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "tag_id")
//    )
//    private Set<Tag> tags = new HashSet<>();

//    public void addTag(Tag tag){
//        this.tags.add(tag);
//        tag.books.add(this);
//    }

//    public void remove(Tag tag){
//        this.tags.remove(tag);
//        tag.books.remove(this);
//    }
    //czy pożyczona i komu
    //gdzie sie znajduje
    //uzytkownik ma biblioteke jedna
    //adm wyświetla liste uzytownikow
    //user dodaje, usuwa i edytuje ksiązki, wyszukuje po tagach itp
    //czy czytami na której stronie jestesmy

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
    public Integer getPages() {
        return pages;
    }
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTags() {
        return tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getBorrowed() {
        return borrowed;
    }
    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public String getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate=" + publicationDate +
                ", pages=" + pages +
                ", isbn='" + isbn + '\'' +
                ", borrowed='" + borrowed + '\'' +
                ", tags='" + tags + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
