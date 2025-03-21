package com.example.Mapping.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "jpa_laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String modelNumber;
    private String brand;

    @OneToOne
    @JoinColumn(name = "Student_id")
    private Student student;


}
