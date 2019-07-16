package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.ShoppingDao;
import com.im.pojo.Shopping;

/**
 * @author wxl
 * @category 购买游戏业务逻辑实现类
 */
@Service
public class ShoppingServiceImpl implements ShoppingService {
	@Resource 
	private ShoppingDao shoppingDao;
	@Override
	public List<Shopping> findByUid(int uid) {
		
		return shoppingDao.findByUid(uid);
	}

	@Override
	public boolean add(Shopping shopping) {
		
		return shoppingDao.add(shopping)>0?true:false;
	}

	@Override
	public Shopping find(int uid, int gid) {
		
		return shoppingDao.find(uid, gid);
	}


}
