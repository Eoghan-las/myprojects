package com.im.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.im.pojo.Game;
import com.im.pojo.Gamekind;
import com.im.pojo.Message;
import com.im.pojo.User;
import com.im.service.GameKindService;
import com.im.service.GameService;
import com.im.service.MessageService;
import com.im.service.UserService;

/**
 * @author wxl
 * @category 用户控制器
 */
@Controller
public class UserController {
	
	@Resource
	public GameService gameService;
	
	@Resource
	GameKindService gameKindService;
	
	@Resource
	public MessageService messageService;
	
	@Resource
	private UserService userService;

	@RequestMapping("/tologin")
	public String toLogin() {
		return "login";
	}

	@RequestMapping("/login")
	public String login( String uname, String upass,HttpSession httpSession,Model model){
		User user = userService.findByNamePass(uname, upass);
		List<Gamekind> kindlist = gameKindService.findAll();
		List<Game> list = gameService.findAll();
		List<Message> list2 = messageService.findAll();
		model.addAttribute("list2", list2);
		model.addAttribute("list", list);
		httpSession.setAttribute("kindlist", kindlist);
		if (user==null) {
			return "404";
		}else{
			httpSession.setAttribute("curuser", user);
			return "index";
		}
	}
	
	@RequestMapping("/tousers")
	public String tousers(Model model) {
		List<User> list = userService.findAll();
		model.addAttribute("users",list);
		return "users";
	}
	
	@RequestMapping("/urole")
	public @ResponseBody List<User> urole(@RequestBody String rid,Model model) {
		List<User> list = new ArrayList<>();
		model.addAttribute("users",list);
		
		if (rid.equals("0")) {
			list = userService.findAll();
		}else{
			int id = Integer.valueOf(rid);
			list = userService.findByRole(id);
		}
		return list;
	}
	@RequestMapping("/findrageinputtime")
	public String findRageInputtime(Date  inputtime1,Date  inputtime2,Model model){
		System.out.println(inputtime1);
		List<User> list=userService.findRageInputtime(inputtime1, inputtime2);
		for (User user : list) {
			System.out.println(user.getUemail());
		}
		model.addAttribute("users", list);
		return "users";
	}
	
	@RequestMapping("/exits")
	public String exits(HttpSession session){
		session.removeAttribute("curuser");
		return "redirect:index.action";
	}

	@RequestMapping("/toedituser")
	public String toedituser(int uid,Model model){
		User user = userService.findById(uid);
		model.addAttribute("user",user);
		return "edituser";
	}
	
	@RequestMapping("/edituser")
	public String edituser(User user){
		boolean flag = userService.update(user);
		if (flag) {
			return "login";
		}else{
			return "404";
		}
		
	}
	
}