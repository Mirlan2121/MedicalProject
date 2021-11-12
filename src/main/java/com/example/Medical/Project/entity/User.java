package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private String login;
    private String password;
    private LocalDateTime createDate; // Добавил Санек


    @PrePersist // Дописал Санек
    public void datePrePersist(){
        this.createDate = LocalDateTime.now();
    }

}
