package com.example.Mapping.service;

import com.example.Mapping.dto.LaptopRequest;
import com.example.Mapping.entity.Laptop;
import com.example.Mapping.entity.Student;
import com.example.Mapping.repository.LaptopRepository;
import com.example.Mapping.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LaptopService {


    private final LaptopRepository laptopRepository;
    private final StudentRepository studentRepository;

    public Laptop createLaptop(LaptopRequest laptop) {

        Student student = new Student();
        student.setStudentName(laptop.getStudent().getStudentName());
        student.setAbout(laptop.getStudent().getAbout());

        Student save1 = studentRepository.save(student);

        StudentRepository studentRepository1 = studentRepository;
        Laptop laptop1 = new Laptop();
        laptop1.setModelNumber(laptop.getModelNumber());
        laptop1.setBrand(laptop.getBrand());
        laptop1.setStudent(save1);
        return laptopRepository.save(laptop1);


    }
}


