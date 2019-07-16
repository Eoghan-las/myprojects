package com.im.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.GameDao;
import com.im.pojo.Game;


/**
 * @author Administrator
 * @category 游戏业务逻辑实现类
 */
@Service
public class GameServiceImpl implements GameService {
	
	@Resource
	private GameDao gamedao;
	
	@Override
	public List<Game> findAll() {
		
		
		
		return gamedao.findAll();
	}

	@Override
	public List<Game> findByKid(int kid) {
		
		return gamedao.findByKid(kid);
	}

	@Override
	public Game findById(int gid) {
		
		return gamedao.findById(gid);
	}

	@Override
	public boolean addGame(Game game) {
		
		return gamedao.addGame(game)>0?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		
		return gamedao.delete(ids)>0?true:false;
	}

	@Override
	public boolean update(Game game) {
		
		return gamedao.update(game)>0?true:false;
	}

	@Override
	public List<Game> finByIds(int[] ids) {
		
		return gamedao.finByIds(ids);
	}

	@Override
	public List<Game> search(String gname) {
		return gamedao.search(gname);
	}

	@Override
	public List<Game> searchBykid(String gname,int kid) {
		return gamedao.searchBykid(gname,kid);
	}

	@Override
	public List<Game> findprt(int nid) {
		
		return gamedao.findprt(nid);
	}

}
