package com.aem.examboot.services.ServiceImpl;

import com.aem.examboot.dto.EmployeDto;
import com.aem.examboot.entity.Employe;
import com.aem.examboot.repository.EmployeRepository;
import com.aem.examboot.services.EmployeService;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeServiceImpl implements EmployeService {

    EmployeRepository employeRepository;

    @Override
    public void saveEmploye(EmployeDto employeDto){
        Employe employe = new Employe();
        employe.setName(employeDto.getName());
        employe.setEmail(employeDto.getEmail());
        employeRepository.save(employe);
    }

    @Override
    public Employe findEmployeByEmail(String email){
        return employeRepository.findEmployeByEmail(email);

    }


    @Override
    public List<EmployeDto> findAllEmployes(){
        List<Employe> employes = employeRepository.findAll();
        return employes.stream().map(this::mapToEmployeDto)
                .collect(Collectors.toList());
    }

    private  EmployeDto mapToEmployeDto(Employe employe){
        EmployeDto employeDto = new EmployeDto();
        employeDto.setName(employe.getName());
        employeDto.setEmail(employe.getEmail());
        return employeDto;
    }

}
