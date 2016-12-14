package cn.edu.henu.personnelManager.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.PersonalInfoDao;
import cn.edu.henu.personnelManager.model.PersonalInfo;
import cn.edu.henu.personnelManager.service.abs.PersonalInfoService;
@Component("personalInfoService")
public class PersonalServiceImpl implements PersonalInfoService {

	private PersonalInfoDao dao;
	
	
	public PersonalInfoDao getDao() {
		return dao;
	}
	@Resource(name="personalInfoDao")
	public void setDao(PersonalInfoDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean updatePersonalInfo(PersonalInfo info) {
		
		return dao.updatePersonalInfo(info);
	}

	@Override
	public boolean deletePersonnalInfoById(int id) {
		return dao.deletePersonnalInfoById(id);
	}

	@Override
	public PersonalInfo getPersonalInfoByRecordId(int id) {
		return dao.getPersonalInfoByRecordId(id);
	}

}
