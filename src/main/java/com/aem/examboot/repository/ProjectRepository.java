package com.aem.examboot.repository;

import com.aem.examboot.entity.Project;
import com.aem.examboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
    Project findByName(String name);

}
