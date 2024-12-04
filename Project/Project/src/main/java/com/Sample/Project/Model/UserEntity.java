package com.Sample.Project.Model;

public class UserEntity {

   
    private int userId;

    private String name;
    private String contactNo;
    private String email;
    private String city;
    private String password;

    // Default constructor
    public UserEntity() {
    }

    // Parameterized constructor
    public UserEntity(String name, String contactNo, String email, String city, String password) {
        this.name = name;
        this.contactNo = contactNo;
        this.email = email;
        this.city = city;
        this.password = password;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}