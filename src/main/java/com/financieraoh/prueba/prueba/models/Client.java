package com.financieraoh.prueba.prueba.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document("clients")
public class Client {
    @Id
    private String id;
    private String name;
    private String lastname_father;
    private String lastname_mother;
    private String document_number;
    private String password;
    private String gender;
    private LocalDateTime create_date;
    private LocalDateTime update_date;

    public Client() {
    }

    public Client(String id, String name, String lastname_father, String lastname_mother, String document_number, String password, String gender) {
        this.id = id;
        this.name = name;
        this.lastname_father = lastname_father;
        this.lastname_mother = lastname_mother;
        this.document_number = document_number;
        this.password = password;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname_father='" + lastname_father + '\'' +
                ", lastname_mother='" + lastname_mother + '\'' +
                ", document_number='" + document_number + '\'' +
                ", gender='" + gender + '\'' +
                ", create_date=" + create_date +
                ", update_date=" + update_date +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname_father() {
        return lastname_father;
    }

    public void setLastname_father(String lastname_father) {
        this.lastname_father = lastname_father;
    }

    public String getLastname_mother() {
        return lastname_mother;
    }

    public void setLastname_mother(String lastname_mother) {
        this.lastname_mother = lastname_mother;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }

    public LocalDateTime getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDateTime update_date) {
        this.update_date = update_date;
    }
}
