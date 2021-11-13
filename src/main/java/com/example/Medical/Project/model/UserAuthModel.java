package com.example.Medical.Project.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAuthModel {
    private String name;
    private String password;
}
