package com.im.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.pojo.Message;
import com.im.pojo.User;
import com.im.service.MessageService;

/**
 * @author wxl
 * @category 咨询控制器
 */
@Controller
public class MessageController {
	@Resource
	private MessageService messageService;
	@RequestMapping("/showmessage")
	public String findAll(Model model,HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("curuser");
		List<Message> list = messageService.findByUid(user.getUid());
		model.addAttribute("list", list);
		
		return "showmessage";
	}

	/* 到增加咨询页面 */
	@RequestMapping("/toaddmessage")
	public String toadd() {
		return "addmessage";
	}

	/* 增加咨询 */
	@RequestMapping("/addmessage")
	public String add(Message message, Model model) {
		message.setMessagetime(new Timestamp(System.currentTimeMillis()));
		boolean flag = messageService.insert(message);
		if (flag) {
			return "redirect:showmessage.action";
		}else{
			model.addAttribute("mess", "增加咨询失败！");
			return "404";
		}
		

	}

	/* 删除咨询 */
	@RequestMapping("deletemessage")
	public String delete(int zid,Model model) {
		boolean flag = messageService.deleteByZid(zid);
		if (flag) {
			return "redirect:showmessage.action";
		} else {
			model.addAttribute("mess", "该条信息已被删除，不能再次删除！");
			return "404";
		}
	}

	/* 准备修改 */
	@RequestMapping("/ReadyUpdatemessage")
	public String findById(int zid, Model model) {
		Message message = messageService.findById(zid);
		model.addAttribute("message", message);
		return "updatemessage";
	}
	/* 修改 */
	@RequestMapping("updatemessage")
	public String update(Message message, Model model) {
		boolean flag = messageService.update(message);
		if (flag) {
			return "redirect:showmessage.action";
		} else {
			model.addAttribute("mess", "修改信息失败！");
			return "404";
		}

	}
	
	@RequestMapping("/tomessages")
	public String tomessages(Model model) {
		List<Message> list = messageService.findAll();
		model.addAttribute("list", list);
		return "messages";
	}

	@RequestMapping("search2")
	public String search2(String ztitle , Model model,HttpSession httpSession){
		User user = (User) httpSession.getAttribute("curuser");
		List<Message> list = messageService.search(ztitle,user.getUid());
		model.addAttribute("list",list );
		return "showmessage";
	}

}
