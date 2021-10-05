package com.example.crud_khoa.service;

import com.example.crud_khoa.entity.Khoa;
import com.example.crud_khoa.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;

    public Khoa saveKhoa(Khoa khoa){
        log.info("Inside saveKhoa");
        return khoaRepository.save(khoa);
    }

    public Khoa findKhoaById(Long departmentId){
        log.info("Inside findKhoaById");
        return khoaRepository.findById(departmentId).get();
    }

}
