package com.aem.examboot.controllers;

import com.aem.examboot.dto.EmployeDto;
import com.aem.examboot.dto.UserDto;
import com.aem.examboot.services.EmployeService;
import com.aem.examboot.services.ServiceImpl.EmployeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeController {

    private EmployeServiceImpl employeService;


    @GetMapping("/Employes")
    public String Employes(Model model){
        List<EmployeDto> employes = EmployeService.findAllEmployes();
        model.addAttribute("employes", employes);
        return "employes";
    }

}
