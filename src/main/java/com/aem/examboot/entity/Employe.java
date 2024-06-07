package com.aem.examboot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employés")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String email;


    private List<String> skills =new ArrayList<>();


    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Project> projects = new ArrayList<>();

    ////degré d'implication à faire



}
