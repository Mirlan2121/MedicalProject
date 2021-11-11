package com.example.Medical.Project.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seminars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Seminars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_seminars", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "link", nullable = false)
    private String link;
    @Column(name = "date_of_the_event", nullable = false)
    private Date dateOfTheEvent;
    @JoinColumn(name = "id_user")
    @OneToOne
    private User user;
}
