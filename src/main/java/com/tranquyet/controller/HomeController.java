package com.tranquyet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tranquyet.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("homepage");
		// Normal Menu
		mav.addObject("menu", homeService.loadMenu());
		return mav;
	}

	@RequestMapping(value = "/springmvc", method = RequestMethod.GET)
	public ModelAndView springMVCPage() {
		ModelAndView mav = new ModelAndView("springmvc");
		// Normal Menu
		mav.addObject("menu", homeService.loadMenu());
		return mav;
	}

	public ModelAndView springWorld() {
		ModelAndView mav = new ModelAndView("spring-world-interceptor");
		
		return mav;
	}

}