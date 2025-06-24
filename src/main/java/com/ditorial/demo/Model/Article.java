package com.ditorial.demo.Model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String title;
    
    private String content;
    
    @ManyToOne
    @JoinColumn(name = "author_username")
    private Author author;
    
    @ManyToOne
    @JoinColumn(name = "editor_username")
    private Editor editor;
    
    @ManyToMany
    @JoinTable(
    name = "article_reviewer",                // name of the join table
    joinColumns = @JoinColumn(name = "article_id"),    // FK to this entity
    inverseJoinColumns = @JoinColumn(name = "reviewer_username")  // FK to the other entity
    )
    private Set<Reviewer> reviewers;
    
    private String status;
    
    private String category;
    
    @Column(nullable = true)
    private String[] tags;
    
    private String[] reviews;
    
    @Column(nullable = true)
    private String date_of_publication;
    
    @Column(nullable = true)
    private String date_of_creation;
    
    @Column(nullable = true)
    private String date_of_modification;
    
    @Column(nullable = true)
    private String image_cover;
    
    @Column(nullable = true)
    private String[] comments;
    
    @Column(nullable = true)
    private String[] likes;

    //Constructors
    public Article() {
        // constructeur sans argument obligatoire pour JPA/Hibernate
    }
    // Constructor with all fields
    public Article(int id, String title, String content, Author author, Editor editor,
                   Set<Reviewer> reviewers, String status, String category, String[] tags,
                   String[] reviews, String date_of_publication, String date_of_creation,
                   String date_of_modification, String image_cover, String[] comments, String[] likes) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.editor = editor;
        this.reviewers = reviewers;
        this.status = status;
        this.category = category;
        this.tags = tags;
        this.reviews = reviews;
        this.date_of_publication = date_of_publication;
        this.date_of_creation = date_of_creation;
        this.date_of_modification = date_of_modification;
        this.image_cover = image_cover;
        this.comments = comments;
        this.likes = likes;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public Editor getEditor() {
        return editor;
    }
    public void setEditor(Editor editor) {
        this.editor = editor;
    }
    public Set<Reviewer> getReviewers() {
        return reviewers;
    }
    public void setReviewers(Set<Reviewer> reviewers) {
        this.reviewers = reviewers;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String[] getTags() {
        return tags;
    }
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String[] getReviews() {
        return reviews;
    }
    public void setReviews(String[] reviews) {
        this.reviews = reviews;
    }
    public String getDate_of_publication() {
        return date_of_publication;
    }
    public void setDate_of_publication(String date_of_publication) {
        this.date_of_publication = date_of_publication;
    }
    public String getDate_of_creation() {
        return date_of_creation;
    }
    public void setDate_of_creation(String date_of_creation) {
        this.date_of_creation = date_of_creation;
    }
    public String getDate_of_modification() {
        return date_of_modification;
    }
    public void setDate_of_modification(String date_of_modification) {
        this.date_of_modification = date_of_modification;
    }
    public String getImage_cover() {
        return image_cover;
    }
    public void setImage_cover(String image_cover) {
        this.image_cover = image_cover;
    }
    public String[] getComments() {
        return comments;
    }
    public void setComments(String[] comments) {
        this.comments = comments;
    }
    public String[] getLikes() {
        return likes;
    }
    public void setLikes(String[] likes) {
        this.likes = likes;
    }
}
