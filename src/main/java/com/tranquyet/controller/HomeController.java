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

	@RequestMapping(value = "/spring-mvc", method = RequestMethod.GET)
	public ModelAndView springMVCPage() {
		ModelAndView mav = new ModelAndView("springmvc");
		// Normal Menu
		mav.addObject("menu", homeService.loadMenu());
		return mav;
	}

	@RequestMapping(value = "spring-test", method = RequestMethod.GET)
	public ModelAndView testURL() {
		ModelAndView mav = new ModelAndView("springworld");
		return mav;
	}

	@RequestMapping(value = "/springworld", method = RequestMethod.GET)
	public ModelAndView springMVC() {
		ModelAndView mav = new ModelAndView("springworld");
		return mav;
	}
}