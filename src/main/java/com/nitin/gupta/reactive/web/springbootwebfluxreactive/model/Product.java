package com.nitin.gupta.reactive.web.springbootwebfluxreactive.model;

import lombok.*;

import javax.persistence.*;
import java.io.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
}
