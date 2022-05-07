package com.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/processForm")
	public String ClickMe() {
		return "form";
	}
	
	/*
	 * @RequestMapping("/saveData") public String SaveAction() { //String
	 * name=Req.getParameter("name"); //System.out.println(name); return "display";
	 * }
	 */

}
