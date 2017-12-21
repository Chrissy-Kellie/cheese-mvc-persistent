package org.launchcode.controllers;

import org.launchcode.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping


public class CategoryController {
    @Autowired
    private CategoryDao cheeseDao;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("categories", cheeseDao.findAll());
        model.addAttribute("title", "My categories");

        return "index.html";
    }
}







