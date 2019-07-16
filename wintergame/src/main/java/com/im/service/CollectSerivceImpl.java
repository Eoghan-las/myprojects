package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.CollectDao;
import com.im.pojo.Collect;

/**
 * @author Administrator
 *@category 游戏收藏 业务逻辑实现类
 */
@Service
public class CollectSerivceImpl implements CollectService {
	
	@Resource
	private CollectDao collectdao;
	@Override
	public boolean add(Collect collect) {
		
		return collectdao.add(collect)>0 ?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		
		return collectdao.delete(ids)>0 ?true:false;
	}

	@Override
	public Collect findById(int uid, int gid) {
		
		return collectdao.findById(uid, gid);
	}

	@Override
	public List<Collect> findById(int uid) {
		return collectdao.findByUid(uid);
	}

}
