package com.im.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;
import com.im.service.InvitationService;

/**
 * @author Eoghan
 * @category 帖子测试类
 */
public class InvitationTest1 {

	@Test
	public void test(){
		//获取spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		//获取dao
		/*InvitationDao invitationDao = context.getBean(InvitationDao.class);
		
		List<Invitation> list = invitationDao.find();
		
		for (Invitation inv : list) {
			System.out.println(inv.getTitle());
		}*/
		InvitationService invitationService = context.getBean(InvitationService.class);
		
		Invitation invitation = new Invitation(0, "测试标题", "吃葡萄不吐葡萄皮", "Eoghan", new Timestamp(System.currentTimeMillis()));
		invitationService.insert(invitation);
		//invitationService.delete(new int[]{23,24,25});
		
		/*Invitation invitation = invitationService.findById(22);
		invitation.setTitle("测试标题-改！！！");
		
		invitationService.update(invitation);*/
		
		
		
		//Invitation invitation = invitationService.findById(1);
		
		List<Invitation> list = invitationService.find();
		
		for (Invitation inv : list) {
			System.out.println(inv.getId()+"\t"+inv.getTitle());
		}
		//System.out.println(invitation.getTitle());
		
	}
}
