package net.niit.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		 ModelAndView mv = new  ModelAndView("page");
		 mv.addObject("greeting","welcome");
		 return mv;
		
	}

}