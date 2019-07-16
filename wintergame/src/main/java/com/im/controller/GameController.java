package com.im.controller;

import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.List;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.im.pojo.Game;
import com.im.pojo.Gamekind;
import com.im.pojo.Message;
import com.im.pojo.Order;
import com.im.pojo.Shopping;
import com.im.pojo.User;
import com.im.service.GameKindService;
import com.im.service.GameService;
import com.im.service.MessageService;
import com.im.service.OrderService;
import com.im.service.ShoppingService;

/**
 * @author Eoghan
 * @category 游戏控制器
 */
@Controller
public class GameController {

	@Resource
	public GameService gameService;
	
	@Resource
	public ShoppingService shop;

	@Resource
	public MessageService messageService;
	
	@Resource
	public OrderService order;
	
	@Resource
	GameKindService gameKindService;
	/*@RequestMapping("/login")
	public String login(){
		return "login";
		
	}*/
	@RequestMapping("/index")
	public String index(HttpSession session,Model model){
		List<Gamekind> kindlist = gameKindService.findAll();
		List<Game> list = gameService.findAll();
		List<Message> list2 = messageService.findAll();
		model.addAttribute("list2", list2);
		model.addAttribute("list", list);
		session.setAttribute("kindlist", kindlist);
		return "index";
	}
	
	
	@RequestMapping("/showgames")
	public String showgames(Model model){
		List<Game> list = gameService.findAll();
		List<Gamekind> list2 = gameKindService.findAll();
		model.addAttribute("games", list);
		model.addAttribute("kinds", list2);
		return "games";
	}
	
	@RequestMapping("/search")
	public String search(String kid,String gname,Model model){
		List<Gamekind> list2 = gameKindService.findAll();
		model.addAttribute("kinds", list2);
		if (kid.equals("0")) {
			List<Game> list=gameService.search(gname);
			model.addAttribute("games", list);
			return "games";
		}else{
			int id = Integer.valueOf(kid);
			List<Game> list = gameService.searchBykid(gname,id);
			model.addAttribute("games", list);
			return "games";
		}
	}
	
	@RequestMapping("/gamekind")
	public @ResponseBody List<Game> gamekind(@RequestBody String kid){
		List<Game> list = new ArrayList<>();
		if (kid.equals("0")) {
			list = gameService.findAll();
		}else{
			int id = Integer.valueOf(kid);
			list = gameService.findByKid(id);
			
		}
		return list;
	}
	@RequestMapping("/toaddgame")
	public String toaddgame(Model model){
		List<Gamekind> list2 = gameKindService.findAll();
		model.addAttribute("kinds", list2);
		return "addgame";
	}
	
	@RequestMapping("/tocopys")
	public String toCopys(int gid,Model model,HttpSession httpSession){
		User user = (User) httpSession.getAttribute("curuser");
		System.out.println(user);
		Game gam = gameService.findById(gid);
		
		Shopping shopp = new Shopping(user.getUid() , gid, new Timestamp(new java.util.Date().getTime()));
		/*Order orders = new Order( gid,  new Timestamp(new java.util.Date().getTime()),user.getUid(), gam.getGprice());
		order.add(orders);*/
		shop.add(shopp);
		Game game = gameService.findById(gid);
		String log = "69725"+game.getGid()+game.getKid()+game.getGprice()+"";
		
		model.addAttribute("log", log);
		model.addAttribute("game", game);
		return "copy";
	}
	
	@RequestMapping("/addgame")
	public String addgame(@ModelAttribute("game") Game game,Date commingtime2){
		
		game.setCommingtime(new Timestamp(commingtime2.getTime()));
		boolean flag = gameService.addGame(game);
		if (flag) {
			
			return "redirect:showgames.action";
		}else{
			return "redirect:index.action";
		}
	}
	
	@RequestMapping("/touploadgame")
	public String touploadgame(int gid,Model model){
		Game game = gameService.findById(gid);
		model.addAttribute("game", game);
		return "uploadgame";
	}
	
	@RequestMapping("/touploadimg")
	public String touploadimg(int gid,Model model){
		Game game = gameService.findById(gid);
		model.addAttribute("game", game);
		return "uploadimg";
	}
	
	@RequestMapping("/uploadgame")
	public String uploadgame(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest request,int gid){
		//文件上传
		File newfile = getFile(file);
		String url = getFileUrl(newfile,request);
		try {
			file.getFileItem().write(newfile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Game game = new Game();
		game.setGid(gid);
		game.setUrl(url);
		gameService.update(game);
		return "redirect:showgames.action";
	}
	
	@RequestMapping("/uploadimg")
	public String uploadimg(@RequestParam("file")CommonsMultipartFile file,HttpServletRequest request,int gid){
		//文件上传
		File newfile = getFile2(file,gid);
		try {
			file.getFileItem().write(newfile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:showgames.action";
	}
	
	//获取文件路径
	private String getFileUrl(File file,HttpServletRequest request) {
		String name = file.getName();
		String url = "http://localhost:"+request.getLocalPort()+"//upload//"+name;
		return url;
	}
	

	//创建服务器新文件
	private File getFile(CommonsMultipartFile file){
		String path = "E://upload";
		String fileName = file.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		File newFile = new File(path, System.currentTimeMillis()+suffix);
		return newFile;
	}
	//创建服务器新图片文件
		private File getFile2(CommonsMultipartFile file,int gid){
			String path = "E://workspace2//wintergame//src//main//webapp//img//bg";
			String fileName = file.getOriginalFilename();
			String suffix = fileName.substring(fileName.lastIndexOf("."));
			File newFile = new File(path, gid+suffix);
			return newFile;
		}
	
	
	@RequestMapping("/portfolio")
	public String search(int nid,Model model){
		List<Game> list = gameService.findprt(nid);
		model.addAttribute("list", list);
		for (Game game : list) {
			System.out.println(game.getGname());
		}
		return "portfolio";
		
	}
	@RequestMapping("/project")
	public String project(int gid,Model model){
		Game game =  gameService.findById(gid);
		model.addAttribute("game", game);
		return "project";
		
	}
	
	@RequestMapping("/deletegames")
	public String deletegames(int[] ids){
		boolean flag =  gameService.delete(ids);
		if (flag) {
			return "redirect:showgames.action";
		}else{
			return "404";
		}
	}
}
