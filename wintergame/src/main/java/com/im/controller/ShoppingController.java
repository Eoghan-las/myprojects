package com.im.controller;

import java.lang.ProcessBuilder.Redirect;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.pojo.Comment;
import com.im.pojo.Game;
import com.im.pojo.GameComment;
import com.im.pojo.Message;
import com.im.pojo.User;
import com.im.service.CommentService;
import com.im.service.GameCommentService;
import com.im.service.GameService;
import com.im.service.MessageService;

/**
 * 购买游戏控制器
 * @author wxl
 * @category 
 */
@Controller
public class ShoppingController {
	@Resource 
	MessageService message;
	@Resource 
	GameService game;
	@Resource 
	CommentService comment;
	
	

	@RequestMapping("/blog")
	public String blog(Model model){
		List<Message> mess = message.findAll();
		model.addAttribute("games", mess);
		return "blog";
	}
	@RequestMapping("/page")
	public String page(Model model){
		List<Message> list = message.findAll();
		model.addAttribute("list",list);
		System.out.println(list.size());
		return "page";
	}
	@RequestMapping("/single")
	public String single(int gid,Model model){
		Message  messages = message.findById(gid);
		System.out.println(gid);
		String games = messages.getGames();
		String[] g =  games.split(",");
		Game[] j= new Game[g.length];
		for (int i = 0; i < g.length; i++) {
			j[i] = game.findById(Integer.parseInt(g[i]));
		}
		List<Comment> list = comment.findByZid(gid);
		model.addAttribute("messages", messages);
		model.addAttribute("list", list);
		model.addAttribute("list2", j);
		model.addAttribute("gid", gid);
		System.out.println(list.size());
		return "single";
	}
	@RequestMapping("/refer")
	public String refer(Comment comment1, Model model,HttpSession httpSession){
		User user = (User) httpSession.getAttribute("curuser");
		comment1.setUid(user.getUid());
		comment1.setInputdate(new Timestamp(System.currentTimeMillis()));
		if(comment.add(comment1)){
			return "redirect:single.action?gid="+comment1.getZid();
		}else{
			return "404";
		}
		
		
	}
}
