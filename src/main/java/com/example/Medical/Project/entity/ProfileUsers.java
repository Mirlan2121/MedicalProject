package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profile_users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ProfileUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name", nullable = false)
    private String username;
    @Column(name = "ser_name", nullable = false)
    private String serName;
    @Column(name = "patron_name", nullable = false)
    private String patronName;
    @Column(name = "INN", nullable = false)
    private String INN;
    @Column(name = "telephone", nullable = false)
    private Long telephone;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "rh_factor", nullable = false)
    private String rhFactor;
    @Column(name = "family_status", nullable = false)
    private String familyStatus;
    @JoinColumn(name = "id_user")
    @OneToOne
    private User user;
}
