package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.GameCommentDao;
import com.im.pojo.GameComment;
/**
 * @author Administrator
 *@category 游戏评论业务逻辑实现类
 */
@Service
public class GameCommentServiceImpl implements GameCommentService {
	
	@Resource
	private GameCommentDao gamecomment;
	@Override
	public List<GameComment> findByGid(int gid) {
		
		return gamecomment.findByGid(gid);
	}

	@Override
	public GameComment findByid(int id) {
		
		return gamecomment.findByid(id);
	}

	@Override
	public boolean add(GameComment gameComment) {
		
		return gamecomment.add(gameComment)>0?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		
		return gamecomment.delete(ids)>0?true:false;
	}

}
