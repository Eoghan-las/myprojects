package com.im.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;

public class Test2 {
	
	@Test
	public void test(){
		// 获取spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		InvitationDao invitationDao = context.getBean(InvitationDao.class);
		List<Invitation> list =invitationDao.search("%微信%");
		
		for (Invitation invitation : list) {
			System.out.println(invitation.getTitle());
		}
	}
}
