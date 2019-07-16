package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.OrderDao;
import com.im.pojo.Order;

/**
 * @author wxl
 * @category 购买游戏记录业务逻辑实现类
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Resource 
	private OrderDao orderDao;
	@Override
	public List<Order> findByUid(int uid) {
		
		return orderDao.findByUid(uid);
	}

	@Override
	public boolean add(Order Order) {
		
		return orderDao.add(Order)>0?true:false;
	}

	@Override
	public Order find(int uid, int gid) {
		
		return orderDao.find(uid, gid);
	}

	@Override
	public List<Order> findByGid(int gid) {
		return orderDao.findByGid(gid);
	}


}
