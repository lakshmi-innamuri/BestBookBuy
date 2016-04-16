/**
 * 
 */
package com.bestbookbuy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

/**
 * @author lakshmi
 *
 */

@Controller
public class UserController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("register", "command", new User());
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("fname", user.getFname());
		model.addAttribute("lname", user.getLname());
		model.addAttribute("email", user.getEmail());

		return "result";
	}
}
