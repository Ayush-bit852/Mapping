package com.example.Mapping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "jpa_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

//    @OneToOne(mappedBy = "student")
//    private Laptop laptop;
}


