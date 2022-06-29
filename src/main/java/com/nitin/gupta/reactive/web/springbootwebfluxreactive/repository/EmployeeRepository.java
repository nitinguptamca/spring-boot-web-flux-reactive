package com.nitin.gupta.reactive.web.springbootwebfluxreactive.repository;

import com.nitin.gupta.reactive.web.springbootwebfluxreactive.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.*;

import java.util.*;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee , Long> {
    Iterable<Employee> findByEmpNoIn(Collection<Long> empNos);
    Iterable<Employee> findByEmpNameContaining(String name);
    @Query("select e from Employee e where e.empName = ?1")
    Iterable<Employee> findQuery(String name);
}
