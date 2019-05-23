package com.patient.models;

import javax.persistence.*;

@Entity
@Table(name = "SUBCANCERTYPE2")
public class SubCancerType2 {
    @Column(name = "pk")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "SUBCANCERTYPEID1")
    private int SubCancerTypeId1;

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

    public int getSubCancerTypeId1() {
        return SubCancerTypeId1;
    }

    @Override
    public String toString() {
        return "SubCancerType2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", SubCancerTypeId1=" + SubCancerTypeId1 +
                '}';
    }

    public void setSubCancerTypeId1(int subCancerTypeId1) {
        SubCancerTypeId1 = subCancerTypeId1;
    }
}
