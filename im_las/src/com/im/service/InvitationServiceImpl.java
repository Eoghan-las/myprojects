package com.im.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;

/**
 * @author Eoghan
 * @category 帖子业务逻辑实现类
 */
@Service
public class InvitationServiceImpl implements InvitationService {

	@Resource
	private InvitationDao invitationDao;
	
	@Override
	public List<Invitation> find() {
		return invitationDao.find();
	}

	@Override
	public Invitation findById(int id) {
		return invitationDao.findById(id);
	}

	@Override
	public boolean insert(Invitation invitation) {
		return invitationDao.insert(invitation)>0?true:false;
	}

	@Override
	public boolean delete(int[] ids) {
		return invitationDao.delete(ids)>0?true:false;
	}

	@Override
	public boolean update(Invitation invitation) {
		return invitationDao.update(invitation)>0?true:false;
	}

	@Override
	public List<Invitation> search(String text) {
		text = "%"+text+"%";
		return invitationDao.search(text);
	}

}
