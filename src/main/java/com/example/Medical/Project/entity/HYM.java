package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "HYM")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class HYM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_HYM", nullable = false)
    private String typeHYM;
    @Column(name = "name_HYM", nullable = false)
    private String name;
    @JoinColumn(name = "id_user")
    @ManyToOne
    private User user;
}
