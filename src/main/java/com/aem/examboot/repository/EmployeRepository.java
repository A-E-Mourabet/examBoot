package com.aem.examboot.repository;

import com.aem.examboot.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
    Employe findEmployeByEmail(String email);

}
