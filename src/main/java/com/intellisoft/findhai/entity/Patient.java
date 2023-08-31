package com.intellisoft.findhai.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(columnDefinition = "TEXT")
    String patientName;

    @Column(columnDefinition = "TEXT")
    String patientID;

    @Column(columnDefinition = "TEXT")
    String gender;

    @Column(columnDefinition = "TEXT")
    String secondaryID;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date createDate;

}
