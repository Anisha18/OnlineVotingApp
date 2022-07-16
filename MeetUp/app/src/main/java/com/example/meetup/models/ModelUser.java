package com.example.meetup;

public class ModelUser {
    String Name,Email,Interests,Uid;

    public ModelUser() {
    }

    public ModelUser(String name, String email, String interests, String uid) {
        Name = name;
        Email = email;
        Interests = interests;
        Uid = uid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getInterests() {
        return Interests;
    }

    public void setInterests(String interests) {
        Interests = interests;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }
}
