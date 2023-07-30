package com.demo.springboottrial.springbootdemo.repository;

import com.demo.springboottrial.springbootdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}

