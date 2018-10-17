package org.agilep365.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	// @Resource(name = "usersService")
	// private UsersService userService;
	private static ArrayList<Users> userList = new ArrayList<Users>();

	@RequestMapping("/updateadd")
	public String update(Users user, Model model, HttpServletRequest request) {
		user.setId(String.valueOf(UUID.randomUUID()));
		model.addAttribute("user", user);
		userList.add(user);
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("userList",userList);
		return "afterlogin";
	}
	
	@RequestMapping("/delete")
	public String delete(String id) {
		List<Users> copyList = (ArrayList)userList.clone();
			for (Users user :copyList){
				if (user.getId().equals(id)){
					userList.remove(user);
				}
			}
		return "afterlogin";
	}

	@RequestMapping("/login")
	public String login(Users user, HttpServletRequest request, Model model) {
		if (userList.size() != 0) {
			// userList.forEach(k -> System.out.println(k));
			// names.forEach(name -> System.out.print(""));
			for (Users name : userList) {
				if (user.getUsername().equals(name.getUsername())
						&& user.getPassword().equals(name.getPassword())) {
					System.out.println(request.getParameter("username"));
					System.out.println(user.toString());
					model.addAttribute("user", user);
				}
			}
		}

		return "afterlogin";
	}

}