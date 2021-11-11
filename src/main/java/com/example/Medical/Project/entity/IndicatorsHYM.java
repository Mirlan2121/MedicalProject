package com.example.Medical.Project.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "indicators_HYM")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class IndicatorsHYM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_indicators_hym", nullable = false)
    private String name;
}
