package com.im.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.im.dao.CollectDao;
import com.im.dao.CommentDao;
import com.im.dao.GameCommentDao;
import com.im.dao.GameDao;
import com.im.dao.GameKindDao;
import com.im.dao.MessageDao;
import com.im.dao.OrderDao;
import com.im.dao.ShoppingDao;
import com.im.dao.UserDao;
import com.im.pojo.Collect;
import com.im.pojo.Comment;
import com.im.pojo.Game;
import com.im.pojo.GameComment;
import com.im.pojo.Gamekind;
import com.im.pojo.Message;
import com.im.pojo.Order;
import com.im.pojo.Shopping;
import com.im.pojo.User;
import com.im.service.OrderService;

public class Las_test {
	
	@Test
	public void test(){
		// 获取spring配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");
		
		/*UserDao userdao = context.getBean(UserDao.class);*/
		
		
		/*User user = userdao.findByName("白帆");
		user.setInputtime(new Timestamp(System.currentTimeMillis()));
		user.setUname("DDDDDDDDDDDDDDDDDD");
		userdao.insert(user);*/
		//方法一
		/*User user = userdao.findById(12);
		user.setUname("AAAAAAAA");
		userdao.update(user);*/
		
		//userdao.delete(new int[] {10,11,12});
		
		/*List<User> list = userdao.findAll();
		for (User user2 : list) {
			System.out.println(user2.getUname());
			System.out.println(user2.getInputtime());
		}*/
		

		/*资讯评论dao测试*/
		//CommentDao commentDao= context.getBean(CommentDao.class);
		
		/*Comment comment = new Comment(2, 1, "写得好", new Timestamp(System.currentTimeMillis()), new User());
		commentDao.add(comment);*/
		
		/*commentDao.delete(new int[]{2,3});*/
		
		/*List<Comment> list = commentDao.findByUid(1);
		
		for (Comment comment : list) {
			System.out.println(comment.getUser().getUname()+":"+comment.getMessage().getZcontent());
		}*/
		
		
		/*游戏评论dao测试*/
		//GameCommentDao gcd = context.getBean(GameCommentDao.class);
		
		/*GameComment gameComment = new GameComment(2, 1, 1, "好玩", new Timestamp(System.currentTimeMillis()));
		gcd.add(gameComment);*/
		
		/*gcd.delete(new int[] {2,3});*/
		
		/*GameComment list = gcd.findByid(1);
		System.out.println(list.getContent());*/
		
		/*List<GameComment> list = gcd.findByUid(1);
		
		for (GameComment gameComment : list) {
			System.out.println(gameComment.getContent());
		}*/
		
		/*游戏类型dao测试*/
		//GameKindDao gameKindDao = context.getBean(GameKindDao.class);
		
		/*Gamekind gamekind = new Gamekind(1, "养成");
		gameKindDao.add(gamekind);*/
		
		/*gameKindDao.delete(new int[] {4,5});*/
		
		/*已购游戏dao测试*/
		/*ShoppingDao dao = context.getBean(ShoppingDao.class);
		
		Shopping shop = new Shopping(1, 2, new Timestamp(System.currentTimeMillis()));
		dao.add(shop);
		
		Shopping shopping = dao.find(1, 2);
		System.out.println(shopping.getUser().getUname()+":"+shopping.getGame().getGname());*/
		
		/*收藏游戏dao测试*/
		/*CollectDao dao = context.getBean(CollectDao.class);
		Collect collect = dao.findById(1, 2);
		System.out.println(collect.getGame().getGname());
		List<Collect> list = dao.findByUid(1);
		for (Collect collect : list) {
			System.out.println(collect.getUser().getUname()+":"+collect.getGame().getGname());
		}*/
		
		/*GameDao dao = context.getBean(GameDao.class);
		List<Game> list = dao.findAll();
		for (Game game : list) {
			System.out.println(game.getGameKind().getKname());
		}*/
		
		/*MessageDao dao = context.getBean(MessageDao.class);
		List<Message> list = dao.findAll();
		for (Message message : list) {
			System.out.println(message.getUser().getUname());
		}*/
		
		
		
	    OrderService dao = context.getBean(OrderService.class);
		
		GameDao gdao = context.getBean(GameDao.class);
		
		for (int i = 0; i < 1000; i++) {
			int rm = (int) (Math.random()*24+1);
			int rm2 = (int) (Math.random()*12);
			Game game = gdao.findById(rm);
			Order o = new Order();
			o.setUid(1);
			o.setGid(rm);
			o.setTime(new Timestamp(new Date(119, rm2, 25).getTime()));
			o.setMoney(game.getGprice());
			dao.add(o);
		}
		/*List<Order> list = dao.findByGid(1);
		for (Order order : list) {
			System.out.println(order.getMoney());
		}*/
	}
}
