/**
 * 
 */
package com.bestbookbuy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * @author lakshmi
 *
 */


	@Controller
	@RequestMapping("/login")
	public class HelloController{
	 
	   @RequestMapping(method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Best Book Buy!");

	      return "login";
	   }
	}

