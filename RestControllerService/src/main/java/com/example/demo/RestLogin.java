//Extra practice only

package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLogin {
//	Path Variable	
	@RequestMapping(value = "/brutin/{a}/{b}", method = RequestMethod.GET)
	
	public int add(@PathVariable int a, @PathVariable int b) {
		System.out.println(a + b);
		return (a+b);
	
//	QueryString
//	@RequestMapping(value = "/brutin", method = RequestMethod.GET)
//	public String addUser(@RequestParam("username") String uid, @RequestParam("password") String pwd) {
//		return (uid +  " " + pwd);
//	}
	
//	Json	
//	{
//		"username":"saroj",
//		"password":"kc"
//	}
//	@RequestMapping(value = "/brutin", method = RequestMethod.POST)
//	public String addUser(@RequestParam("username") String uid, @RequestParam("password") String pwd) {
//		return (uid +  " " + pwd);
//	}
	}
}
