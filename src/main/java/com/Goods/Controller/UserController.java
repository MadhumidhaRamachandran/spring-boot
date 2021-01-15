package com.Goods.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Goods.Dao.UserDao;
import com.Goods.Entity.User;

@Controller
public class UserController {

	@Autowired
	private UserDao dao;

	@GetMapping("/login")
	public ModelAndView Login(ModelAndView view, User user) {
		view.addObject("user", user);
		view.setViewName("Login");
		return view;

	}

	@PostMapping("/showProduct")
	public ModelAndView getAllProduct(@ModelAttribute("user") User user, ModelAndView view) {

		User user1 = dao.getUser(user);
		if (user1 != null && user1.getPassword().equalsIgnoreCase(user.getPassword())) {
			view.addObject("list", dao.getAllProduct());
			view.setViewName("show_products");
			return view;
		} else {
			view.addObject("message","Invalid UserName or password");
			view.setViewName("Login");
			return view;
		}

	}

}
