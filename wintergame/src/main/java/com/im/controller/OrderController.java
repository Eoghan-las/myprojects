package com.im.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.im.pojo.Order;
import com.im.service.OrderService;

/**
 * @author wxl
 * @category 购买游戏记录控制器
 */
@Controller
public class OrderController {
	
	@Resource
	OrderService orderService;
	
	@RequestMapping("/tjxl")
	public @ResponseBody List<Order> tj(@RequestBody String gid){
		System.out.println(gid);
		List<Order> list = new ArrayList<>();
		if (gid!=null&&!gid.equals("")) {
			int id = Integer.valueOf(gid);
			list = orderService.findByGid(id);
		}
		return list;
	}
}
