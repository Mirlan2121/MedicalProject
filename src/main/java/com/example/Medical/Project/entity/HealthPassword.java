package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "health_password")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class HealthPassword {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JoinColumn(name = "id_user")
    @OneToOne
    private User user;
}
