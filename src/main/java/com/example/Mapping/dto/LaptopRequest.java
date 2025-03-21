package com.example.Mapping.dto;

import com.example.Mapping.entity.Student;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class LaptopRequest {

    private String modelNumber;
    private String brand;
    private StudentRequest student;

}
