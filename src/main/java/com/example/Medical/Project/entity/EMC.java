package com.example.Medical.Project.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "EMC")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EMC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "heredity", nullable = false)
    private String heredity;
    @Column(name = "vaccinations", nullable = false)
    private String vaccinations;
    @Column(name = "family_history", nullable = false)
    private String familyHistory;
    @Column(name = "obstetric_history", nullable = false)
    private String obstetricHistory;
    @Column(name = "drug_intolerance", nullable = false)
    private String drugIntolerance;
    @JoinColumn(name = "id_user")
    @OneToOne
    private User user;
}
