package com.example.Medical.Project.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "pages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Pages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_pages")
    private String name;
    @Column(name = "text_pages")
    private String text;
}
