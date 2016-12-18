package cn.edu.henu.personnelManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.ReckoningManager;
import cn.edu.henu.personnelManager.model.Reckoning;
import cn.edu.henu.personnelManager.model.ReckoningInfo;
import cn.edu.henu.personnelManager.model.ReckoningList;
import cn.edu.henu.personnelManager.service.abs.ReckoningService;

@Component("reckoningService")
public class ReckoningServiceImpl implements ReckoningService {

	ReckoningManager manager;
	
	public ReckoningManager getManager() {
		return manager;
	}
	@Resource(name="reckoningDao")
	public void setManager(ReckoningManager manager) {
		this.manager = manager;
	}

	@Override
	public boolean addReckoning(ReckoningInfo info, Reckoning reckoning,
			ReckoningList list) {
		return manager.addReckoning(info, reckoning, list);
	}

	@Override
	public boolean updateReckoning(ReckoningInfo info, Reckoning reckoning,
			ReckoningList list) {
		return manager.updateReckoning(info, reckoning, list);
	}

	@Override
	public ReckoningInfo getReckoningInfoById(int id) {
		return manager.getReckoningInfoById(id);
	}

	@Override
	public Reckoning getReckoningById(int id) {
		return manager.getReckoningById(id);
	}

	@Override
	public ReckoningList getReckoningListById(int id) {
		return manager.getReckoningListById(id);
	}

	@Override
	public List<Reckoning> getAllReckoning() {
		return manager.getAllReckoning();
	}

}
