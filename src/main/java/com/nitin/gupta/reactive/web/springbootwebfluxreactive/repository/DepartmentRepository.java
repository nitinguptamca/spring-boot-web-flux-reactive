package com.nitin.gupta.reactive.web.springbootwebfluxreactive.repository;

import com.nitin.gupta.reactive.web.springbootwebfluxreactive.model.*;
import org.springframework.data.jpa.repository.*;

public interface DepartmentRepository extends JpaRepository<Department ,Long> {
}
