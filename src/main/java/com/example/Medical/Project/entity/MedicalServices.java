package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "medical_services")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MedicalServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_services", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "contraindications", nullable = false)
    private String contraindications;
    @JoinColumn(name = "id_medical_institution")
    @ManyToOne
    private MedicalInstitution medicalInstitution;
    @JoinColumn(name = "id_diagnosis")
    @ManyToOne
    private Diagnosis diagnosis;
}
