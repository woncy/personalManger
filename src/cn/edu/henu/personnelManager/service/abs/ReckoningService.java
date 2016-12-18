package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Reckoning;
import cn.edu.henu.personnelManager.model.ReckoningInfo;
import cn.edu.henu.personnelManager.model.ReckoningList;

public interface ReckoningService {
	public boolean addReckoning(ReckoningInfo info,Reckoning reckoning,ReckoningList list);
	public boolean updateReckoning(ReckoningInfo info,Reckoning reckoning,ReckoningList list);
	public ReckoningInfo getReckoningInfoById(int id);
	public Reckoning getReckoningById(int id);
	public ReckoningList getReckoningListById(int id);
	public List<Reckoning> getAllReckoning();
}
