package com.example.Medical.Project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Doctor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "doc_name", nullable = false)
    private String name;
    @Column(name = "doc_ser_name", nullable = false)
    private String serName;
    @Column(name = "doc_phone", nullable = false)
    private Integer telethon;
    @Column(name = "doc_specialization", nullable = false)
    private String specialization;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;


}
