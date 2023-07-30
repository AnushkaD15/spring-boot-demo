package com.demo.springboottrial.springbootdemo.service;

import com.demo.springboottrial.springbootdemo.entity.Department;
import com.demo.springboottrial.springbootdemo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartment();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}
