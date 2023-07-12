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
public class CourseFee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double courseFee;
}
