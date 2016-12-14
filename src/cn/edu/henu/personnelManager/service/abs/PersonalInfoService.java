package cn.edu.henu.personnelManager.service.abs;

import cn.edu.henu.personnelManager.model.PersonalInfo;

public interface PersonalInfoService {
	public boolean updatePersonalInfo(PersonalInfo info);
	public boolean deletePersonnalInfoById(int id);
	public PersonalInfo getPersonalInfoByRecordId(int id);
}
