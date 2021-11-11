package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "medicines")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Medicines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_medicines", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "indications_for_user", nullable = false)
    private String indicationsForUser;
    @Column(name = "side_effects", nullable = false)
    private String sideEffects;
    @Column(name = "method_of_application", nullable = false)
    private String methodOfApplication;
    @JoinColumn(name = "id_diagnosis")
    @ManyToOne
    private Diagnosis diagnosis;
}
