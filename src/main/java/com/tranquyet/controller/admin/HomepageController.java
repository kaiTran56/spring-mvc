package com.tranquyet.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="homeOfController")
public class HomepageController {

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView goHomepage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
}
