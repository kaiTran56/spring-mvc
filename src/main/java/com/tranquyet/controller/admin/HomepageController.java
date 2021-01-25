package com.tranquyet.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "homeOfController")
public class HomepageController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView goHomepage() {
		ModelAndView mav = new ModelAndView("admin/homeworld");
		return mav;
	}
	
	@RequestMapping(value = "/home/admin", method = RequestMethod.GET)
	public ModelAndView goAdmin() {
		ModelAndView mav = new ModelAndView("admin/home");
		return mav;
	}

}
