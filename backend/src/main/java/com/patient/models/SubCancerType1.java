package com.patient.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SUBCANCERTYPE1")
public class SubCancerType1 implements Serializable {
    @Column(name = "pk")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "CANCERTYPEID")
    private int CancerTypeId;

    public int getCancerTypeId() {
        return CancerTypeId;
    }

    @Override
    public String toString() {
        return "SubCancerType1{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", CancerTypeId=" + CancerTypeId +
                '}';
    }

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

    public void setCancerTypeId(int cancerTypeId) {
        CancerTypeId = cancerTypeId;
    }
}
