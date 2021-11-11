package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "type_user", nullable = false)
    private String typeUser;
    @Column(name = "date_of_registration")
    private Date dateOfRegistration;
    @Column(name = "active", nullable = false)
    private Long active;
    @Column(name = "delete_user")
    private Boolean delete;
    @ManyToMany
    @JoinColumn(name = "id_medical_institution")
    private MedicalInstitution medicalInstitution;
}
