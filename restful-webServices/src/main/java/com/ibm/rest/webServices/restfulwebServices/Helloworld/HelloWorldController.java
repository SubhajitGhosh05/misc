package com.ibm.rest.webServices.restfulwebServices.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//GET
	//URI - /hello-world
	//"method" - "Hello World"
	//@RequestMapping(method = RequestMethod.GET , path = "/hello-world")
	@GetMapping(path = "/hello-world")
	//@GetMapping("/")
	public String helloWorld() {
		return "Hello Kolkata";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public helloWorldBean helloWorldBean() {
		return new helloWorldBean("Hello Kolkata Good Morning !!!");
	}
	
	//hello-world/path-variable/{name}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public helloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new helloWorldBean(String.format("Welcome to India, %s", name));
	}
	
	@GetMapping("/mitro/{msg}")
	public String Modiji(@RequestParam String abc,@PathVariable String msg) {
		return abc+""+"WahModijiWah"+msg;
	}
}
