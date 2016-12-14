package cn.edu.henu.personnelManager.dao.impl;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.PersonalInfoDao;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.PersonalInfo;

@Component("personalInfoDao")
public class PersonalInfoDaoImpl extends SuperDao implements PersonalInfoDao{

	@Override
	public boolean addPersonalInfo(PersonalInfo info) {
		try{
			this.getHibernateTemplate().save(info);
		}catch(Exception e){
e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updatePersonalInfo(PersonalInfo info) {
		try{
			this.getHibernateTemplate().update(info);
		}catch(Exception e ){
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePersonnalInfoById(int id) {
		try{
			PersonalInfo info = this.getHibernateTemplate().get(PersonalInfo.class, id);
			this.getHibernateTemplate().delete(info);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public PersonalInfo getPersonalInfoByRecordId(int id) {
		PersonalInfo info = null;
		try{
			info = this.getHibernateTemplate().get(PersonalInfo.class, id);
		}catch(Exception  e){
			return null;
		}
		return info;
	}

}
