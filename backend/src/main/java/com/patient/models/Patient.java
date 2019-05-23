package com.patient.models;

import javax.persistence.*;

@Entity
@Table(name = "PATIENTTYPE")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk")
    private int id;

    @Column(name = "title")
    private String title;

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

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

}
