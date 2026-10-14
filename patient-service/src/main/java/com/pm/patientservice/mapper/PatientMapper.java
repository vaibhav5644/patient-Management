package com.pm.patientservice.mapper;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.getDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;
    }


    public static void main(String[] args) {
        System.out.println("test _featue _2");
    }
}
