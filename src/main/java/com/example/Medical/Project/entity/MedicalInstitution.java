package com.example.Medical.Project.entity;

import javax.persistence.*;

@Entity
@Table(name = "medical_institution")
public class MedicalInstitution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "medical_name", nullable = false)
    private String name;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "type_institution", nullable = false)
    private String typeInstitution;

}
