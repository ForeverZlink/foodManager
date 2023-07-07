package com.example.foodManager.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {
    private String baseTemplatesDirectory = "/foodControllerTemplates";

    @PostMapping("/createNewFood")
    public void createNewFood(Model model){

    }

}
