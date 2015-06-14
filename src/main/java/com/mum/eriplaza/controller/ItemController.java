package com.mum.eriplaza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;


@Controller
public class ItemController {
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ItemService itemService;
	
	String name;

	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
	public String inputItem(Model model) {
		
		Item item = new Item();		
		model.addAttribute("item", item);
	
		
		model.addAttribute("categories", categoryService.getAll());
		
		
		
		return "itemAdd";
	}
	
	 @RequestMapping(value="/add", method = RequestMethod.POST)
	    public String saveItem(@ModelAttribute Item item)
	    {
	    		
		 itemService.save(item);
		 
		 return "succesful";
		 
	    }
}
