package com.demo.springboottrial.springbootdemo.Controller;


import com.demo.springboottrial.springbootdemo.entity.Department;
import com.demo.springboottrial.springbootdemo.service.DepartmentService;
import com.demo.springboottrial.springbootdemo.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping(value= "/departments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }
}
