package com.nitin.gupta.reactive.web.springbootwebfluxreactive.model;

import lombok.*;

import javax.persistence.*;
import java.io.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dept")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptNo;
    private String deptName;
    private String location;
    @OneToMany(mappedBy = "department")
    private Collection<Employee> employeeCollection;
}
