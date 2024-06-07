package com.aem.examboot.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ProjectDto {

    private Long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private double budget;



}
