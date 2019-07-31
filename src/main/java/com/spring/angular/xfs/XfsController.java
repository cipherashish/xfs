package com.spring.angular.xfs;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
//@RequestMapping("/myservice")
public class XfsController {  

	@RequestMapping(
		    value = "/process", 
		    method = RequestMethod.POST)
		public void process(@RequestBody Map<String, Object> payload) 
		    throws Exception {

		  System.out.println(payload);
    }
	@GetMapping(path = "/hello")
    public  JSONPObject sayHello()
    {
        return new JSONPObject("{'aa':'bb'}", null);
    }
}