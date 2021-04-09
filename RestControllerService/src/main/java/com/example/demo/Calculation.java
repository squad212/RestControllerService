package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //annotation
public class Calculation {
	//http://localhost:40/add/10/20 //default domain name with methodname and inputs
	@RequestMapping(value ="/addCal/{a}/{b}", method = RequestMethod.GET)  //path variable
	public int add (@PathVariable int a, @PathVariable int b) {
		int add = a+b;
		return add;
	}
	
	
	//http://localhost:40/mul/10/2/4    //path variable 
	@RequestMapping (value = "/mul/{a}/{b}/{c}", method = RequestMethod.GET)//method mul is accessiable by /mul/10/2/4
	public int mul (@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		int mul = a*b*c;
		return mul;
	}
	
	//http://localhost:40/divCal?param1=10&param2=2
	@RequestMapping (value = "/divCal", method = RequestMethod.POST) //query string
	public int div(@RequestParam ("param1") int a, @RequestParam ("param2") int b)  {
		int div = a/b;
		return div;
	}
}





