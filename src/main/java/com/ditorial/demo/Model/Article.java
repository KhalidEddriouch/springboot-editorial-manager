package com.ditorial.demo.Model;

public class Article {
    private int id ;
    private String title;
    private String content;
    private String username_author;
    private String username_editor;
    private String[] username_reviewers;
    private String status;
    private String category;
    private String[] tags;
    private String[] reviews;
    private String date_of_publication;
    private String date_of_creation;
    private String date_of_modification;
    private String image_cover;
    private String[] comments;
    private String[] likes;

    //Constructor
    public Article(int id, String title, String content, String username_author, String username_editor,
                   String[] username_reviewers, String status, String category, String[] tags,
                   String[] reviews, String date_of_publication, String date_of_creation,
                   String date_of_modification, String image_cover, String[] comments, String[] likes) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username_author = username_author;
        this.username_editor = username_editor;
        this.username_reviewers = username_reviewers;
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
    public String getUsername_author() {
        return username_author;
    }
    public void setUsername_author(String username_author) {
        this.username_author = username_author;
    }
    public String getUsername_editor() {
        return username_editor;
    }
    public void setUsername_editor(String username_editor) {
        this.username_editor = username_editor;
    }
    public String[] getUsername_reviewers() {
        return username_reviewers;
    }
    public void setUsername_reviewers(String[] username_reviewers) {
        this.username_reviewers = username_reviewers;
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
