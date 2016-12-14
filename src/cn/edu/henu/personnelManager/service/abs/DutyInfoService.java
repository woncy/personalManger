package cn.edu.henu.personnelManager.service.abs;

import cn.edu.henu.personnelManager.model.DutyInfo;

public interface DutyInfoService {
	public boolean addDutyInfo(DutyInfo info);
	public boolean updateDutyInfo(DutyInfo info);
	public DutyInfo getDutyInfoById(int id);
	public boolean deleteDutyInfo(DutyInfo info);
	public boolean deleteDutyInfo(int id);
}
