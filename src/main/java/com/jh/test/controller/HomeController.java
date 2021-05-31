package com.jh.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {
		System.out.println("page move~~~~~");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("content/home"); 
		return mv;
	}
	
}
