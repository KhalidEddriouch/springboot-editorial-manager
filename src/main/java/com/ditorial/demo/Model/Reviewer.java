package com.ditorial.demo.Model;

import java.util.Date;

public class Reviewer {
    private String first_name;
    private String last_name;
    private String user_name;
    private Date date_of_birth;
    private String password;
    private String email;
    private String phone_number;
    private String address;
    private String city;
    private String country;
    private String biographie;
    private String study_level;
    private String profile_picture;
    private String cv;

    // Constructor
    public Reviewer(String first_name, String last_name, String user_name, Date date_of_birth, String password,
                    String email, String phone_number, String address, String city, String country,
                    String biographie, String study_level, String profile_picture, String cv) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.date_of_birth = date_of_birth;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.city = city;
        this.country = country;
        this.biographie = biographie;
        this.study_level = study_level;
        this.profile_picture = profile_picture;
        this.cv = cv;
    }
    // Getters and Setters
    public String getFirst_name() {
        return first_name;
    }

   public String getLast_name() {
       return last_name;
   }

   public String getUser_name() {
       return user_name;
   }

   public Date getDate_of_birth() {
       return date_of_birth;
   }

   public String getPassword() {
       return password;
   }

   public String getEmail() {
       return email;
   }

   public String getPhone_number() {
       return phone_number;
   }

   public String getAddress() {
       return address;
   }

   public String getCity() {
       return city;
   }

   public String getCountry() {
       return country;
   }

   public String getBiographie() {
       return biographie;
   }

   public String getStudy_level() {
       return study_level;
   }

   public String getProfile_picture() {
       return profile_picture;
   }

   public String getCv() {
       return cv;
   }

   // Setters
   public void setFirst_name(String first_name) {
       this.first_name = first_name;
   }

   public void setLast_name(String last_name) {
       this.last_name = last_name;
   }

   public void setUser_name(String user_name) {
       this.user_name = user_name;
   }

   public void setDate_of_birth(Date date_of_birth) {
       this.date_of_birth = date_of_birth;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public void setEmail(String email) {
       this.email = email;
   }

   public void setPhone_number(String phone_number) {
       this.phone_number = phone_number;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public void setCity(String city) {
       this.city = city;
   }

   public void setCountry(String country) {
       this.country = country;
   }

   public void setBiographie(String biographie) {
       this.biographie = biographie;
   }

   public void setStudy_level(String study_level) {
       this.study_level = study_level;
   }

   public void setProfile_picture(String profile_picture) {
       this.profile_picture = profile_picture;
   }

   public void setCv(String cv) {
       this.cv = cv;
   }
}
