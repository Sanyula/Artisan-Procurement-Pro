package com.solvertechug.solutions.artisanprocurement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.solvertechug.solutions.artisanprocurement.domain.*;
import com.solvertechug.solutions.artisanprocurement.service.*;


@Controller
//@RequestMapping("/book")
public class InventoryItemsController {
	
	@Autowired
	private ItemsService service;
	
	@GetMapping("/")
	public String showItemsList(@RequestParam(value="name",required=false,defaultValue="") String name,Model model) {
        List<InventoryItem> itemsList = service.listAll();
        model.addAttribute("items", itemsList);
        model.addAttribute("name", (name.isEmpty())?"N/A":name);
        System.out.print("Get / ");	
        return "index";
    }
	
	

}
