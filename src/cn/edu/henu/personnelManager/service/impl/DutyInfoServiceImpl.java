package cn.edu.henu.personnelManager.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import cn.edu.henu.personnelManager.dao.abs.DutyInfoDao;
import cn.edu.henu.personnelManager.model.DutyInfo;
import cn.edu.henu.personnelManager.service.abs.DutyInfoService;
@Component("dutyInfoService")
public class DutyInfoServiceImpl implements DutyInfoService{
	private DutyInfoDao dutyInfoDao;

	public DutyInfoDao getDutyInfoDao() {
		return dutyInfoDao;
	}
	@Resource(name="dutyInfoDao")
	public void setDutyInfoDao(DutyInfoDao dutyInfoDao) {
		this.dutyInfoDao = dutyInfoDao;
	}
	@Override
	public boolean addDutyInfo(DutyInfo info) {

		return dutyInfoDao.addDutyInfo(info);
	}
	@Override
	public boolean updateDutyInfo(DutyInfo info) {
		return dutyInfoDao.updateDutyInfo(info);
	}
	@Override
	public DutyInfo getDutyInfoById(int id) {
		return dutyInfoDao.getDutyInfoById(id);
	}
	@Override
	public boolean deleteDutyInfo(DutyInfo info) {
		return dutyInfoDao.deleteDutyInfo(info);
	}
	@Override
	public boolean deleteDutyInfo(int id) {
		return dutyInfoDao.deleteDutyInfo(id);
	}
	
}
