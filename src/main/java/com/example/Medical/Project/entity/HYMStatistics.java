package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "HYM_statistics")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class HYMStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "meaning", nullable = false)
    private String meaning;
    @JoinColumn(name = "id_HYM")
    @OneToOne
    private HYM hym;
    @JoinColumn(name = "id_indicators_hym")
    @ManyToOne
    private IndicatorsHYM indicatorsHYM;
}
