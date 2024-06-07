package com.aem.examboot.services.ServiceImpl;

import com.aem.examboot.dto.ProjectDto;
import com.aem.examboot.dto.UserDto;
import com.aem.examboot.entity.Project;
import com.aem.examboot.entity.User;
import com.aem.examboot.repository.ProjectRepository;
import com.aem.examboot.repository.UserRepository;
import com.aem.examboot.services.ProjectService;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository ProjectRepository;

    @Override
    public void saveProject(ProjectDto projectDto){
        Project project = new Project();
        project.setName(projectDto.getName());
        project.setBudget(projectDto.getBudget());
        ProjectRepository.save(project);
    }

    @Override
    public Project findProjetByName(String name){
        return ProjectRepository.findByName(name);

    }

    @Override
    public List<ProjectDto> findAllProjects(){
        List<Project> projects = ProjectRepository.findAll();
        return projects.stream().map(this::mapToProjectDto)
                .collect(Collectors.toList());
    }

    private ProjectDto mapToProjectDto(Project project){
        ProjectDto projectDto = new ProjectDto();
        projectDto.setName(project.getName());
        projectDto.setBudget(project.getBudget());

        return projectDto;
    }




}
