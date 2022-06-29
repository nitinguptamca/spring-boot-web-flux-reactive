package com.nitin.gupta.reactive.web.springbootwebfluxreactive.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.datatype.jsr310.deser.*;
import com.fasterxml.jackson.datatype.jsr310.ser.*;
import lombok.*;

import javax.persistence.*;
import java.io.*;
import java.time.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Emp")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empNo;
    private String empName;
    private String job;
    private int age;
    private int mgr;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate hireDate;
    private double salary;
    private long mobile;
    @ManyToOne
    private Department department;
}
