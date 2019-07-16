package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.GameDao;
import com.im.dao.MessageDao;
import com.im.pojo.Game;
import com.im.pojo.Message;

/**
 * @author wxl
 * @category  咨询业务逻辑实现类
 */
@Service
public class MessageServiceImpl implements MessageService {
	@Resource
	private MessageDao  messageDao;
	
	private GameDao gameDao;
	@Override
	public List<Message> findAll() {
		
		return messageDao.findAll();
	}

	@Override
	public Message findById(int zid) {
		
		return messageDao.findById(zid);
	}

	@Override
	public boolean insert(Message message) {
		
		return messageDao.insert(message)>0?true:false;
	}

	@Override
	public boolean update(Message message) {
		
		return messageDao.update(message)>0?true:false;
	}

	@Override
	public boolean delete(int[] zids) {
		
		return messageDao.delete(zids)>0?true:false;
	}

	@Override
	public List<Message> search(String ztitle,int uid) {
		
		return messageDao.search(ztitle,uid);
	}

	@Override
	public List<Message> findByUid(int uid) {
		return messageDao.findByUid(uid);
	}

	@Override
	public boolean deleteByZid(int zid) {
		return messageDao.deleteByZid(zid)>0?true:false;
	}

	@Override
	public List<Message> findByGame(String gid) {
		
		return messageDao.findByGame(gid);
	}

}
