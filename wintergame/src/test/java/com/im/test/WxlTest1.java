package com.im.test;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.MessageDao;
import com.im.pojo.Message;

/**
 * @author wxl
 * @category 资讯数据访问测试
 */
public class WxlTest1 {
	
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring.xml");
		MessageDao MessageDao=context.getBean(MessageDao.class);
		/*======咨询测试========*/
		
		/*查 所有*/
		 /*List<Message> list=MessageDao.findAll();
		 for (Message m : list) {
			System.out.println(m.getGames()+"\t"+m.getUid()+"\t"+m.getMessagetime());
		}*/
		
		/*查*/
		/*Message  m=MessageDao.findById(1);
		System.out.println(m.getGames()+"\t"+m.getZcontent());*/
		
		/*增加*/
	/*	Message m = MessageDao.findById(2);
		m.setZtitle("JJJJJJJ");
		System.out.println(m.getUid()+" : 0000000000000000000000000000");
		int i=MessageDao.insert(m);
		System.out.println(i);*/
		
		/*删*/
		/*int i=MessageDao.delete(new int[] {1});
		System.out.println(i);*/
		
		/*改*/
		/*Message message=new Message();
	
		message.setZid(2);
		message.setGames("英雄联盟");
		
		int i=MessageDao.update(message);
		System.out.println(i);*/
		
	
	}
}
