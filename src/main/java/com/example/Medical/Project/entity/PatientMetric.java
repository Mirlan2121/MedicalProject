package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "patient_metric")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PatientMetric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "the_environment_of_the_head", nullable = false)
    private String theEnvironmentOfTheHead;
    @Column(name = "breast_environment", nullable = false)
    private String breastEnvironment;
    @Column(name = "waist_circumference", nullable = false)
    private String waistCircumference;
    @Column(name = "height_patient", nullable = false)
    private Integer heightPatient;
    @Column(name = "weight_patient", nullable = false)
    private Integer weightPatient;
    @Column(name = "body_mass_index", nullable = false)
    private Long bodyMassIndex;
    @JoinColumn(name = "id_user")
    @OneToOne
    private User user;
}
