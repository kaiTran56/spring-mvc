package com.tranquyet.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tranquyet.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	public List<String> loadMenu() {
		List<String> menu = new ArrayList<String>();
		menu.add("Tran Quyet");
		menu.add("Tran Kai");
		menu.add("Bui Quynh");
		return menu;
	}

	public List<String> loadMenuInterceptor() {
		List<String> menuInterceptor = new ArrayList<String>();
		menuInterceptor.add("Tran Quyet-International");
		menuInterceptor.add("Bui Quynh-VietNam");
		return menuInterceptor;
	}

}
