package com.sch.springboot.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Dwitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String message;
    private String image;

    @Column(name="sdate", nullable = true)
    private LocalDate sdate;
    @PrePersist
    public void prePersist() {
        if (this.sdate == null) {
            this.sdate = LocalDate.now();
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getImage() {
        return image;
    }

    public LocalDate getSdate() {
        return sdate;
    }
}
