package com.example.phoenix.controller;

import com.example.phoenix.domain.Patient;
import com.example.phoenix.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getAll() {
        return this.patientService.findAll();
    }

    @GetMapping("/{code}")
    public Patient getByCode(@PathVariable("code") long code) {
        return this.patientService.getByCode(code);
    }

}
