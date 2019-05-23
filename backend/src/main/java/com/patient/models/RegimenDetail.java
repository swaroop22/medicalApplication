package com.patient.models;

import javax.persistence.*;

@Entity
@Table(name = "REGIMENDETAIL")
public class RegimenDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk")
    private Long id;


    @Column(name = "SUBCANCERTYPEID2")
    private int SubCancerTypeId2;

    @Column(name = "disp_name", columnDefinition = "NVARCHAR(MAX)")
    private String dispName;

    @Column(name = "name", columnDefinition = "NVARCHAR(MAX)")
    private String name;

    @Column(name = "schedule", columnDefinition = "NVARCHAR(MAX)")
    private String schedule;

    @Column(name = "emetogenic_potential", columnDefinition = "NVARCHAR(MAX)")
    private String emetogenicPotential;

    @Column(name = "reference", columnDefinition = "NVARCHAR(MAX)")
    private String reference;

    @Column(name = "dosage_modifications", columnDefinition = "NVARCHAR(MAX)")
    private String dosageModifications;

    @Column(name = "brand_names", columnDefinition = "NVARCHAR(MAX)")
    private String brandNames;

    @Override
    public String toString() {
        return "RegimenDetail{" +
                "id=" + id +
                ", SubCancerTypeId2=" + SubCancerTypeId2 +
                ", dispName='" + dispName + '\'' +
                ", name='" + name + '\'' +
                ", schedule=" + schedule +
                ", emetogenicPotential='" + emetogenicPotential + '\'' +
                ", reference='" + reference + '\'' +
                ", dosageModifications='" + dosageModifications + '\'' +
                ", brandNames='" + brandNames + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSubCancerTypeId2() {
        return SubCancerTypeId2;
    }

    public void setSubCancerTypeId2(int subCancerTypeId2) {
        SubCancerTypeId2 = subCancerTypeId2;
    }

    public String getDispName() {
        return dispName;
    }

    public void setDispName(String dispName) {
        this.dispName = dispName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getEmetogenicPotential() {
        return emetogenicPotential;
    }

    public void setEmetogenicPotential(String emetogenicPotential) {
        this.emetogenicPotential = emetogenicPotential;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDosageModifications() {
        return dosageModifications;
    }

    public void setDosageModifications(String dosageModifications) {
        this.dosageModifications = dosageModifications;
    }

    public String getBrandNames() {
        return brandNames;
    }

    public void setBrandNames(String brandNames) {
        this.brandNames = brandNames;
    }


}
