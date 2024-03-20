package com.hhl.controllers;

import com.hhl.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
@Controller
public class HomeController {
    
    @Autowired
    private CategoryService cateService;
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", this.cateService.getCates());
        
        return "index";
    }
}
