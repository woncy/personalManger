package cn.edu.henu.personnelManager.dao.impl;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.DutyInfoDao;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.DutyInfo;
@Component("dutyInfoDao")
public class DutyInfoDaoImpl extends SuperDao implements DutyInfoDao{

	@Override
	public boolean addDutyInfo(DutyInfo info) {
		try{
			this.getHibernateTemplate().save(info);
		}catch(Exception e){
e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateDutyInfo(DutyInfo info) {
		try{
			this.getHibernateTemplate().update(info);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public DutyInfo getDutyInfoById(int id) {
		DutyInfo info;
		try{
			info = this.getHibernateTemplate().get(DutyInfo.class, id);
		}catch(Exception e){
			return null;
		}
		return info;
	}

	@Override
	public boolean deleteDutyInfo(DutyInfo info) {
		return this.deleteDutyInfo(info.getId());
	}

	@Override
	public boolean deleteDutyInfo(int id) {
		try{
			DutyInfo info = this.getDutyInfoById(id);
			this.getHibernateTemplate().delete(info);
		}catch(Exception e){
			return false;
		}
		return true;
	}

}
