package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.CommentDao;
import com.im.pojo.Comment;
/**
 * @author Administrator
 *@category 资讯业务逻辑实现类
 */
@Service
public class CommentServiceImpl implements CommentService {
	
	@Resource
	private CommentDao commentdao;
	
	@Override
	public boolean add(Comment comment) {
		
		return commentdao.add(comment)>0?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		
		return commentdao.delete(ids)>0?true:false;
	}

	@Override
	public List<Comment> findByZid(int zid) {
		
		return commentdao.findByZid(zid);
	}

	@Override
	public List<Comment> findByUid(int zid) {
		
		return commentdao.findByUid(zid);
	}

}
