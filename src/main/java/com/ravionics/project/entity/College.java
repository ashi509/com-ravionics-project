package com.ravionics.project.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank
    private String collegeName;
    @NotBlank
    private String courseName;
    @NotBlank
    private String durationOfCourse;
    @NotBlank
    @Column(name = "accommodation_ac_/_non_ac")
    private String accommodationAcOrNonAc;
    @NotBlank
    private String accommodationFee;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private CourseFee courseFee;

}
