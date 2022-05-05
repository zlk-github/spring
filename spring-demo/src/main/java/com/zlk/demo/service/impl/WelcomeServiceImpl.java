package com.zlk.demo.service.impl;

import com.zlk.demo.service.WelcomeService;
import org.springframework.stereotype.Service;

//@Service
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String getName(String name) {
		System.out.printf("===============name:"+name);
		return "success";
	}
}
