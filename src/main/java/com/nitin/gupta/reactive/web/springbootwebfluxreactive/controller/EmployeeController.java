package com.nitin.gupta.reactive.web.springbootwebfluxreactive.controller;

import com.nitin.gupta.reactive.web.springbootwebfluxreactive.model.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @PostMapping
    public Employee getEmployee(@RequestBody Employee e){
        Employee emp = new Employee();
        emp.setEmpName("testing");
        return emp;
    }
}
