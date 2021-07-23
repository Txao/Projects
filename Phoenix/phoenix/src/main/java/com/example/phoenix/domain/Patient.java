package com.example.phoenix.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "patients")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "patient_code")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientCode;

    private String surname;
    private String name;
    private String patronymic;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    private String disease;
    private String allergy;
    private String medication;

    @Column(name = "blood_type")
    private String bloodType;

    private Integer weight;
    private Integer height;

}
