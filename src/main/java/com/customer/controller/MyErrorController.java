package com.customer.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {


	private static final String PATH = "/error";

	@Override
	public String getErrorPath() {
		return PATH;
	}
	
	@RequestMapping(value = PATH)
	public String error() {
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
    			System.out.println(ste);
		}
		System.out.println("Error controller called");

		return "forward:/index.html";
	}
}
