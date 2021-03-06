package com.ibm.rest.webServices.restfulwebServices.Filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilteringcontroller {
	
@GetMapping("/dynamicfiltering")
public MappingJacksonValue retreiveSomeBean() {
DynamicSomeBean dynamicSomeBean =new DynamicSomeBean("value1","value2","value3");
SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
FilterProvider filters= new SimpleFilterProvider().addFilter("DynamicSomeBeanFilter", filter);
MappingJacksonValue mapping= new MappingJacksonValue(dynamicSomeBean);
mapping.setFilters(filters);
return mapping;
}

@GetMapping("/dynamiclist-filtering")
public MappingJacksonValue retrieveListOfSomeBeans(){
List<DynamicSomeBean> list = Arrays.asList(new DynamicSomeBean("value1","value2","value3"),new DynamicSomeBean("value11","value22","value33"));
SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
FilterProvider filters= new SimpleFilterProvider().addFilter("DynamicSomeBeanFilter", filter);
MappingJacksonValue mapping= new MappingJacksonValue(list);
mapping.setFilters(filters);
return mapping;
}
}
