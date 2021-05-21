package com.app.boot.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(method = RequestMethod.GET , value = "/")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
}
