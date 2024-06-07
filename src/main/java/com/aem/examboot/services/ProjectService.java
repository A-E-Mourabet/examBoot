package com.aem.examboot.services;

import com.aem.examboot.dto.ProjectDto;
import com.aem.examboot.entity.Employe;
import com.aem.examboot.entity.Project;

import java.util.List;

public interface ProjectService {

    void saveProject(ProjectDto projectDto);

    Project findProjetByName(String name);

    List<ProjectDto> findAllProjects();
}
