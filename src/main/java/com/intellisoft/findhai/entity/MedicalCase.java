package com.intellisoft.findhai.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
public class MedicalCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(columnDefinition = "TEXT")
    String patientID;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfAdmission;

    @Column(columnDefinition = "TEXT")
    String surgicalProcedure;

    @Column(columnDefinition = "TEXT")
    String surgicalLocation;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfSurgery;

    @Column(columnDefinition = "TEXT")
    String scheduling;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date createDate;

}
