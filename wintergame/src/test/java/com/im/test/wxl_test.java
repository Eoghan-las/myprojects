package com.im.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.GameDao;
import com.im.dao.OrderDao;
import com.im.dao.UserDao;
import com.im.pojo.Game;
import com.im.pojo.Order;
import com.im.pojo.User;

public class wxl_test {
	/* 用户数据访问实现类测试 */
	/*
	 * @Test public void test(){ // 获取spring配置文件 ApplicationContext context =
	 * new ClassPathXmlApplicationContext("spring/spring.xml");
	 * 
	 * UserDao userdao = context.getBean(UserDao.class);
	 * 
	 * name查 User user = userdao.findByName("白帆"); user.setInputtime(new
	 * Timestamp(System.currentTimeMillis()));
	 * user.setUname("DDDDDDDDDDDDDDDDDD"); userdao.insert(user); //方法一
	 * 
	 * id查 User user = userdao.findById(12); user.setUname("AAAAAAAA");
	 * userdao.update(user);
	 * 
	 * 根据数组删 //userdao.delete(new int[] {10,11,12});
	 * 
	 * List<User> list = userdao.findAll(); for (User user2 : list) {
	 * System.out.println(user2.getUname());
	 * System.out.println(user2.getInputtime()); }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	/* 游戏数据访问实现类测试 */
	@Test
	public void test() {
		// 获取spring配置文件
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		GameDao gameDao = context.getBean(GameDao.class);*/
		/* 查询所有游戏列表 */
		/*
		 * List<Game> list=gameDao.findAll(); System.out.println(list.size());
		 */

		/* 根据游戏类型查询游戏列表 */
		/*List<Game> list = gameDao.findByKid(1);
		System.out.println(list.size());*/

		/* 根据游戏id查询游戏对象 */
		/*Game game = gameDao.findById(1);
		System.out.println(game);*/
		
		/*上传新游戏*/
		/*Game game=new Game();
		game.setGname("超级玛丽");
		game.setKid(2);
		game.setContent("蘑菇真好吃");
		game.setGamespace("手游");
		game.setSaler("张华");
		game.setGprice(15896);
		game.setComming(1);
		game.setCommingtime(new Timestamp(System.currentTimeMillis()));
		int i=gameDao.addGame(game);
		System.out.println(i);*/
		
		/*删除*/
		/*gameDao.delete(new int[] {1});*/
		
		/*修改游戏信息*/ 
		/*Game game=gameDao.findById(2);
		game.setGamespace("网通");
		gameDao.update(game);*/
		
		 /*根据游戏id数组查询游戏列表*/
		/*List<Game> list=gameDao.finByIds(new int[]{3,4,5});
		System.out.println(list);
		for (Game game : list) {
			System.out.println(game.getGname());
		}*/
		
		/*===================购买游戏记录测试======================*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

		OrderDao orderDao = context.getBean(OrderDao.class);
		 Order order =orderDao.find(2, 2);
		 System.out.println(order.getUid());
	}
	
	
}
