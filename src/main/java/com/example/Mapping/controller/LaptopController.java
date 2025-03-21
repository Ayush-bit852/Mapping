package com.example.Mapping.controller;


import com.example.Mapping.dto.LaptopRequest;
import com.example.Mapping.entity.Laptop;
import com.example.Mapping.exception.LaptopNotFoundException;
import com.example.Mapping.repository.LaptopRepository;
import com.example.Mapping.service.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
// http://localhost:8080/laptop/create
@RestController
@RequestMapping("/laptop")
@RequiredArgsConstructor
public class LaptopController {


    private final LaptopService laptopService;


//    private List<Laptop> laptops = new ArrayList<>();

//    @GetMapping("/allLaptop")
//    public List<Laptop> getAllLaptops() {
//        return laptops;
//    }
//    @GetMapping("byId/{laptopId}")
//    public Laptop getLaptopById(@PathVariable int laptopId) {
//        for (Laptop laptop : laptops) {
//            if (laptop.getLaptopById() == laptopId) {
//                return laptop;
//            }
//        }
//        throw new LaptopNotFoundException("Laptop not found with ID: " + laptopId);
//    }

//    @GetMapping("/student/{studentId}")
//    public Laptop getLaptopByStudentId(@PathVariable int studentId) {
//        for (Laptop laptop : laptops) {
//            if (laptop.getLaptopById() == studentId) {
//                return laptop;
//            }
//        }
//        throw new LaptopNotFoundException("Laptop not found for Student with ID: " + studentId);
//    }

    @PostMapping("/create")
    public Laptop createLaptop(@RequestBody LaptopRequest laptop) {
        return laptopService.createLaptop(laptop);

    }
//
//    @DeleteMapping("/{laptopId}")
//    public String deleteLaptop(@PathVariable int laptopId) {
//        laptops.removeIf(laptop -> laptop.getLaptopById() == laptopId);
//        return "Laptop deleted successfully!";
//    }

}
