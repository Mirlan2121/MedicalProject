package com.example.Medical.Project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "surveys")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Surveys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "examination_time", nullable = false)
    private Date examinationTime;
    @Column(name = "examination_indications", nullable = false)
    private String examinationIndications;
    @Column(name = "comment_surveys", nullable = false)
    private String commentSurveys;
    @Column(name = "place_of_examination", nullable = false)
    private String placeOfExamination;
    @Column(name = "result_surveys", nullable = false)
    private String resultSurveys;
    @Column(name = "purpose", nullable = false)
    private String purpose;
    @Column(name = "note", nullable = false)
    private String note;
    @JoinColumn(name = "id_profile_users")
    @OneToOne
    private ProfileUsers profileUsers;
    @JoinColumn(name = "id_doctor")
    @ManyToOne
    private Doctor doctor;
}
