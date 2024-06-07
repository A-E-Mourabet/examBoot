package com.aem.examboot.services;

import com.aem.examboot.dto.EmployeDto;
import com.aem.examboot.dto.UserDto;
import com.aem.examboot.entity.Employe;
import com.aem.examboot.entity.User;

import java.util.List;

public interface EmployeService {

    void saveEmploye(EmployeDto employeDto);

    Employe findEmployeByEmail(String email);

    List<EmployeDto> findAllEmployes();


}
