package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Alein;
import com.raj.demo.dao.Aleinrepo;

@Controller

public class AlienController {
	@Autowired
	Aleinrepo repo;
	
	@RequestMapping("/")
	
public String home() {
	return "home.jsp";
	
}
	
	@RequestMapping("/addAlein")

	public String addAliein(Alein alein) {
		repo.save(alein);
		return "home.jsp";
		
	}
	
	@RequestMapping("/getAlein")

	public String getAliein(@RequestParam int aid) {
		
		ModelAndView mv=new ModelAndView("showAlein.jsp");
		Alein alein = repo.findById(aid).orElse(null);
		
		mv.addObject(alein);
		
		return "showAlein.jsp";
		
	}
}
