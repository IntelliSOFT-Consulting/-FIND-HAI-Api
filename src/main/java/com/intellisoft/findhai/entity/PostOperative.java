package com.intellisoft.findhai.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
public class PostOperative {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(columnDefinition = "TEXT")
    String patientID;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateOfEvent;

    @Column(columnDefinition = "TEXT")
    String woundPresentSignsOfInfection;

    @Column(columnDefinition = "TEXT")
    String infectionPresentDuringSurgery;

    @Column(columnDefinition = "TEXT")
    String typeOfSsi;

    @Column(columnDefinition = "TEXT")
    String drainageOrMaterial;

    @Column(columnDefinition = "TEXT")
    String painOrTenderness;

    @Column(columnDefinition = "TEXT")
    String erythemaOrRedness;

    @Column(columnDefinition = "TEXT")
    String heat;

    @Column(columnDefinition = "TEXT")
    String fever;

    @Column(columnDefinition = "TEXT")
    String incisionDrained;

    @Column(columnDefinition = "TEXT")
    String woundDehisces;

    @Column(columnDefinition = "TEXT")
    String abscess;

    @Column(columnDefinition = "TEXT")
    String otherSymptoms;

    @Column(columnDefinition = "TEXT")
    String sinusTract;

    @Column(columnDefinition = "TEXT")
    String hypothermia;

    @Column(columnDefinition = "TEXT")
    String apnea;

    @Column(columnDefinition = "TEXT")
    String bradycardia;

    @Column(columnDefinition = "TEXT")
    String lethargy;

    @Column(columnDefinition = "TEXT")
    String cough;

    @Column(columnDefinition = "TEXT")
    String nausea;

    @Column(columnDefinition = "TEXT")
    String vomiting;

    @Column(columnDefinition = "TEXT")
    String samplesSentForCulture;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date createDate;

}
