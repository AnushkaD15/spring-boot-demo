package com.demo.springboottrial.springbootdemo.service;

import com.demo.springboottrial.springbootdemo.entity.Department;
import com.demo.springboottrial.springbootdemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
