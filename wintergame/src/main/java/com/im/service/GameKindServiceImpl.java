package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.GameKindDao;
import com.im.pojo.Gamekind;

/**
 * @author wxl
 * @category  游戏类型业务逻辑实现类
 */
@Service
public class GameKindServiceImpl implements GameKindService {
	@Resource
	private GameKindDao gameKindDao;
	@Override
	public List<Gamekind> findAll() {
		
		return gameKindDao.findAll();
	}

	@Override
	public Gamekind findById(int kid) {
		
		return gameKindDao.findById(kid);
	}

	@Override
	public boolean add(Gamekind gamekind) {
		
		return gameKindDao.add(gamekind)>0?true:false;
	}

	@Override
	public boolean delete(int[] kids) {
		
		return gameKindDao.delete(kids)>0?true:false;
	}

}
