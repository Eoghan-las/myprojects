package com.im.controller;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.pojo.Invitation;
import com.im.service.InvitationService;

/**
 * @author Eoghan
 * @category 帖子控制器
 */
@Controller
public class InvitationController {

	/**
	 * 业务逻辑依赖
	 */
	@Resource
	private InvitationService invitationService;
	
	/**
	 * 访问主页控制器
	 * @return
	 */
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	/**
	 * 查询所有帖子
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Model model){
		List<Invitation> list = invitationService.find(); 
		model.addAttribute("list", list);
		return "list";
	}
	
	/**
	 * 准备发帖
	 * @return
	 */
	@RequestMapping("/tofatie")
	public String tofatie(){
		return "fatie";
	}
	
	/**
	 * 发帖
	 * @param invitation
	 * @param model
	 * @return
	 */
	@RequestMapping("/insert")
	public String insert(Invitation invitation,Model model){
		invitation.setCreatedate(new Timestamp(System.currentTimeMillis()));
		boolean flag = invitationService.insert(invitation);
		if (flag) {
			return "redirect:list.action";
		}else{
			model.addAttribute("mess","添加错误");
			return "error";
		}
		
	}
	
	/**
	 * 删除帖子
	 * @param ids
	 * @param model
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(int[] ids,Model model){
		boolean flag = invitationService.delete(ids);
		if (flag) {
			return "redirect:list.action";
		}else{
			model.addAttribute("mess","删除错误");
			return "error";
		}
		
	}
	
	/**
	 * 准备修改帖子
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/toedit")
	public String toedit(int id,Model model){
		Invitation invitation = invitationService.findById(id);
		model.addAttribute("inv",invitation);
		return "edit";
	}
	
	/**
	 * 修改帖子
	 * @param invitation
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/edit",produces="text/html;charset=utf-8")
	public String edit(Invitation invitation,Model model){
		boolean flag = invitationService.update(invitation);
		if (flag) {
			return "redirect:list.action";
		}else{
			model.addAttribute("mess","修改错误");
			return "error";
		}
	}
	
	/**
	 * 模糊查询帖子列表
	 * @param text
	 * @param model
	 * @return
	 */
	@RequestMapping("/search")
	public String search(String text,Model model){
		List<Invitation> list = invitationService.search(text); 
		model.addAttribute("list", list);
		model.addAttribute("text", text);
		return "list";
	}
}
