package com.example.Medical.Project.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Diagnosis")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_diagnosis", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @JoinColumn(name = "id_user")
    @ManyToOne
    private User user;
}
