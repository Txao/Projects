package com.example.phoenix.service;

import com.example.phoenix.domain.Patient;
import com.example.phoenix.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    public Patient getByCode(long code) {
        return this.patientRepository.getByPatientCode(code);
    }
}
