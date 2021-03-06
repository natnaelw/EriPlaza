package com.mum.eriplaza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;



@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value={"/","/welcome"})
	public String welcome(Model model,@ModelAttribute("categories") Category category) {
		model.addAttribute("greeting", "EriPlaZa!");
		model.addAttribute("tagline", "A classified advertisements and shopping website with sections devoted to jobs, housing, personals, for sale, items wanted and services");
		return "welcome";
	}
	
	@ModelAttribute
	public void init(Model model){
		model.addAttribute("items",itemService.findAll());
		model.addAttribute("categories",categoryService.findAll());
	}
}
