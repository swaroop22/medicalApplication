package com.patient.models;

import javax.persistence.*;

@Entity
@Table(name = "CANCERTYPE")
public class CancerType {
    @Column(name = "pk")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "PATIENTTYPEID")
    private int PatientTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientTypeId() {
        return PatientTypeId;
    }

    public void setPatientTypeId(int patientTypeId) {
        PatientTypeId = patientTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "title")
    private String title;

    @Override
    public String toString() {
        return "CancerType{" +
                "id=" + id +
                ", PatientTypeId=" + PatientTypeId +
                ", title='" + title + '\'' +
                '}';
    }
}
