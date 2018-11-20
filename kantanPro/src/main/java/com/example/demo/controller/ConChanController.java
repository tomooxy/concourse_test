package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConChanController {

	@RequestMapping(value = "/con")
	public String index() {
		return "conchan";
	}
}
