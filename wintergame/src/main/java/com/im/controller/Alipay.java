package com.im.controller;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.pojo.Game;
import com.im.pojo.Gamekind;
import com.im.pojo.Shopping;
import com.im.pojo.User;
import com.im.service.CollectService;
import com.im.service.GameKindService;
import com.im.service.GameService;
import com.im.service.ShoppingService;
import com.im.service.UserService;

@Controller
public class Alipay {
	
	@Resource
	public GameService gameService;

	
	@Resource
	GameKindService gameKindService;
	@Resource
	CollectService collect;
	@Resource
	ShoppingService shopping;
	
	@Resource
	UserService user;
	
	@RequestMapping("/alipay")
	public String index(Game game, Model model){
		
		model.addAttribute("game", game);
		return "redirect:alipay.trade.page.pay.jsp";
	};
	
	/*@RequestMapping("/gamespart")
	public String showgames(int kid ,Model model){
		List<Game> games = gameService.findByKid(kid);
		Gamekind game = gameKindService.findById(kid);
		model.addAttribute("games", games);
		model.addAttribute("game", game);
		return "gamespart";
	};*/
	@RequestMapping("/portfolio1")
	public String portfolio1(int kid ,Model model){
		List<Game> games = gameService.findByKid(kid);
		Gamekind game = gameKindService.findById(kid);
		model.addAttribute("games", games);
		model.addAttribute("game", game);
		return "portfolio1";
	};
	@RequestMapping("/collect")
	public String index(int uid,Model model){
		List<Shopping> list = shopping.findByUid(uid);
		List<Game> list1 = new ArrayList<>();
		for (Shopping shop : list) {
			list1.add(gameService.findById(shop.getGid()));
			System.out.println(shop.getGame());
		}
		model.addAttribute("list", list1);
		return "collect";
	};
	
	@RequestMapping("/regist")
	public String regist(){
		return "regist";
	};
	@RequestMapping("/regists")
	public String regists(User user1){
		
		Timestamp timestamp = new Timestamp(new Date().getTime());
		user1.setInputtime(timestamp);
		user1.setUloa(2);
		user.insert(user1);
		return "redirect:index.action";
	};
	

}
