package com.ibm.rest.webServices.restfulwebServices.Filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringcontroller {
	
@GetMapping("/staticfiltering")
public StaticSomeBean retreiveSomeBean() {
	return new StaticSomeBean("value1","value2","value3");
}

@GetMapping("/staticlist-filtering")
public List<StaticSomeBean>retrieveListOfSomeBeans(){
return Arrays.asList(new StaticSomeBean("value1","value2","value3"),new StaticSomeBean("value11","value22","value33"));
}
}
