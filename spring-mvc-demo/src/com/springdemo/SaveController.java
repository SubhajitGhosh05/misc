package com.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveController {
@RequestMapping("/saveData1")
public String SaveAction(HttpServletRequest Req, Model model) {
String name=Req.getParameter("name");
String person=name.toUpperCase();
String result="DJ "+person;
model.addAttribute("message", result);
System.out.println(name);
return "display";	
}


@RequestMapping("/saveData")
public String SaveActionModel(@RequestParam("name")String name, Model model) {
String person=name.toUpperCase();
String result="VGM "+person;
model.addAttribute("message", result);
System.out.println(name);
return "display";	
}

}
