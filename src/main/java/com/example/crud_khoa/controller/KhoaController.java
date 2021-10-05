package com.example.crud_khoa.controller;

import com.example.crud_khoa.entity.Khoa;
import com.example.crud_khoa.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departments")
@Slf4j
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @PostMapping("/")
    public Khoa saveDepartment(@RequestBody Khoa khoa) {
        log.info("Inside saveDepartment Controller");
        return khoaService.saveKhoa(khoa);
    }

    @GetMapping("/{id}")
    public Khoa findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside FindDepartmentById Controller");
        return khoaService.findKhoaById(departmentId);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Good morning everybody !!";
    }
}
