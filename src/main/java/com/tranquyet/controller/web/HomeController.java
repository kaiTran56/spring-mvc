package com.tranquyet.controller.web;

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

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");

		return mav;
	}

	@RequestMapping(value = "/springmvc", method = RequestMethod.GET)
	public ModelAndView springMVCPage() {
		ModelAndView mav = new ModelAndView("web/homepage");
		// Normal Menu
		mav.addObject("menu", homeService.loadMenu());
		return mav;
	}

	@RequestMapping(value = "spring-test", method = RequestMethod.GET)
	public ModelAndView testURL() {
		ModelAndView mav = new ModelAndView("web/homepage");
		return mav;
	}

	@RequestMapping(value = "/springworld", method = RequestMethod.GET)
	public ModelAndView springMVC() {
		ModelAndView mav = new ModelAndView("springworld");
		return mav;
	}

	@RequestMapping(value = "/springhome", method = RequestMethod.GET)
	public ModelAndView springHome() {
		ModelAndView mav = new ModelAndView("springworld");
		return mav;
	}
}