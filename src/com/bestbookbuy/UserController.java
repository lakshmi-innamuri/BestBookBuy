/**
 * 
 */
package com.bestbookbuy;

import javax.servlet.http.HttpServletRequest;

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

@Controller("BestBookBuy")
public class UserController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("register", "command", new User());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model,HttpServletRequest request) {
		request.getSession().setAttribute("testVariable", "Session value");
		model.addAttribute("fname", user.getFname());
		model.addAttribute("lname", user.getLname());
		model.addAttribute("email", user.getEmail());
		try {
			DBInterface db = new DBInterface();
			
			model.addAttribute("lname",db.DBInterface1());
			if(db.register(user.getFname(),user.getLname(),user.getEmail())){
				return "home";
			}else{
				model.addAttribute("error","Sorry,Error during registration. Please try again.");
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public ModelAndView addBook() {
		return new ModelAndView("addBook", "command", new Book());
	}
	
	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("SpringWeb") Book book, ModelMap model) {
		model.addAttribute("title", book.getTitle());
		model.addAttribute("isbn", book.getIsbn());
		model.addAttribute("price", book.getPrice());

		return "bookList";
	}
	
	
}
