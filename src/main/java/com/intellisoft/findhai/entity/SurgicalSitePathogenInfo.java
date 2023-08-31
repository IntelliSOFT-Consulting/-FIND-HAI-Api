package com.intellisoft.findhai.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
public class SurgicalSitePathogenInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(columnDefinition = "TEXT")
    String patientID;

    @Column(columnDefinition = "TEXT")
    String typeOfLaboratoryConfirmedBsi;

    @Column(columnDefinition = "TEXT")
    String specimen;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateOfSampleCollection;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateOfSampleProcessingInLab;

    @Column(columnDefinition = "TEXT")
    String cultureFindings;

    @Column(columnDefinition = "TEXT")
    String acinetobactorSpecies;

    @Column(columnDefinition = "TEXT")
    String otherPathogenIdentified;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateOfSampleReception;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date dateOfCultureFindings;

    @Column(columnDefinition = "TEXT")
    String enterobacterIdentifed;

    @Column(columnDefinition = "TEXT")
    String amoxicillin;

    @Column(columnDefinition = "TEXT")
    String amikacin;

    @Column(columnDefinition = "TEXT")
    String ampicillin;

    @Column(columnDefinition = "TEXT")
    String cloxacillin;

    @Column(columnDefinition = "TEXT")
    String cotrimoxazole;

    @Column(columnDefinition = "TEXT")
    String cephalexin;

    @Column(columnDefinition = "TEXT")
    String ciprofloxacin;

    @Column(columnDefinition = "TEXT")
    String colistinSulphate;

    @Column(columnDefinition = "TEXT")
    String cefoTaxime;

    @Column(columnDefinition = "TEXT")
    String erythromycin;

    @Column(columnDefinition = "TEXT")
    String gentamycin;

    @Column(columnDefinition = "TEXT")
    String nalidxicAcid;

    @Column(columnDefinition = "TEXT")
    String norfloxacin;

    @Column(columnDefinition = "TEXT")
    String penicilin;

    @Column(columnDefinition = "TEXT")
    String tobramycin;

    @Column(columnDefinition = "TEXT")
    String vancomycin;

    @Column(columnDefinition = "TEXT")
    String ceftazidime;

    @Column(columnDefinition = "TEXT")
    String ceftriaxone;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date createDate;
}
