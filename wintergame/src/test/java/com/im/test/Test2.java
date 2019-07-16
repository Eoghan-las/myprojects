package com.im.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.UserDao;
import com.im.pojo.User;

public class Test2 {
	
	@Test
	public void test(){
		// 获取spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		UserDao userdao = context.getBean(UserDao.class);
		
		
		/*User user = userdao.findByName("白帆");
		user.setInputtime(new Timestamp(System.currentTimeMillis()));
		user.setUname("DDDDDDDDDDDDDDDDDD");
		userdao.insert(user);*/
		//方法一
		List<User> list = userdao.findAll();
		
		for (User user2 : list) {
			System.out.println(user2.getUname());
			System.out.println(user2.getInputtime());
		}
		

		
	}
}
