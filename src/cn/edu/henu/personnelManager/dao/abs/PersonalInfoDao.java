package cn.edu.henu.personnelManager.dao.abs;

import cn.edu.henu.personnelManager.model.PersonalInfo;

public interface PersonalInfoDao {
	public boolean addPersonalInfo(PersonalInfo info);
	public boolean updatePersonalInfo(PersonalInfo info);
	public boolean deletePersonnalInfoById(int id);
	public PersonalInfo getPersonalInfoByRecordId(int id);
}
