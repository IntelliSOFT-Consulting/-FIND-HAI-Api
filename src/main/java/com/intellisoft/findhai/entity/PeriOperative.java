package com.intellisoft.findhai.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
public class PeriOperative {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(columnDefinition = "TEXT")
    String patientID;

    @Column(columnDefinition = "TEXT")
    String riskFactors;

    @Column(columnDefinition = "TEXT")
    String bloodGlucoseLevels;

    @Column(columnDefinition = "TEXT")
    String bloodGlucoseMeasured;

    @Column(columnDefinition = "TEXT")
    String bloodSugarControlIntervention;

    @Column(columnDefinition = "TEXT")
    String preOpBathShower;

    @Column(columnDefinition = "TEXT")
    String antiBacterialSoapUsed;

    @Column(columnDefinition = "TEXT")
    String hairRemoval;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Date hairRemovalDate;

    @Column(columnDefinition = "TEXT")
    String chlorhexidineAlcohol;

    @Column(columnDefinition = "TEXT")
    String iodineAlcohol;

    @Column(columnDefinition = "TEXT")
    String iodineAq;

    @Column(columnDefinition = "TEXT")
    String chlorhexidineAq;

    @Column(columnDefinition = "TEXT")
    String skinAllowedToDry;

    @Column(columnDefinition = "INTEGER")
    Integer timeSpentOnProcedure;

    @Column(columnDefinition = "TEXT")
    String plainSoapWater;

    @Column(columnDefinition = "TEXT")
    String antiMicrobialSoapWater;

    @Column(columnDefinition = "TEXT")
    String alcoholBasedHandRub;

    @Column(columnDefinition = "TEXT")
    String preOpAntibioticsProphylaxis;

    @Column(columnDefinition = "TEXT")
    String otherAntibioticsPreOp;

    @Column(columnDefinition = "TEXT")
    String antibioticsCeasedAtSurgeryCompletion;

    @Column(columnDefinition = "TEXT")
    String postOpAntibioticsProphylaxis;

    @Column(columnDefinition = "TEXT")
    String otherAntibioticsPostOp;

    @Column(columnDefinition = "TEXT")
    String postOpAntibioticsReasons;

    @Column(columnDefinition = "TEXT")
    String postOpAntibioticsOtherReasons;

    @Column(columnDefinition = "TEXT")
    String drainInserted;

    @Column(columnDefinition = "TEXT")
    String drainLocation;

    @Column(columnDefinition = "TEXT")
    String implantUsed;

    @Column(columnDefinition = "TEXT")
    String antibioticInPresenceOfDrain;

    @Column(columnDefinition = "TEXT")
    String otherTypeOfImplant;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    Date createDate;

}

