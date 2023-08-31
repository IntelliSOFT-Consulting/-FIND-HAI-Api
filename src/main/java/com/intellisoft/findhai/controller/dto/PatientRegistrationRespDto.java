package com.intellisoft.findhai.controller.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.intellisoft.findhai.entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class PatientRegistrationRespDto {

    private String message;
    private Patient patient;

}
