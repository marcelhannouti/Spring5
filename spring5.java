package com.example.Sprint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class spring5 {
	@RequestMapping("/1")
	public String spring1() {
		return "spring1.html";
	}
	@ResponseBody
	@RequestMapping("/")
	public String spring2() {
		return "spring2.html";
	}
	@RequestMapping("/1")
	public String spring3() {
		return "spring3.html";
	}
