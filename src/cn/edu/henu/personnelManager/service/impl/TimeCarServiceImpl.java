package cn.edu.henu.personnelManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.TimecardDao;
import cn.edu.henu.personnelManager.model.Record;
import cn.edu.henu.personnelManager.model.TimeCard;
import cn.edu.henu.personnelManager.service.abs.TimeCardService;
@Component("timecardService")
public class TimeCarServiceImpl implements TimeCardService{

	TimecardDao timecardDao;
	
	public TimecardDao getTimecardDao() {
		return timecardDao;
	}
	@Resource
	public void setTimecardDao(TimecardDao timecardDao) {
		this.timecardDao = timecardDao;
	}

	@Override
	public boolean addTimecard(TimeCard card) {
		return timecardDao.addTimecard(card);
	}

	@Override
	public TimeCard getTimecard(int id) {
		return timecardDao.getTimecard(id);
	}

	@Override
	public boolean deleteTimecard(TimeCard card) {
		return timecardDao.deleteTimecard(card);
	}

	@Override
	public boolean deleteTimecard(int card) {
		return timecardDao.deleteTimecard(card);
	}

	@Override
	public boolean updateTimecard(TimeCard card) {
		return timecardDao.updateTimecard(card);
	}

	@Override
	public List<TimeCard> getCardByRecord(Record record) {
		return timecardDao.getCardByRecord(record);
	}

}
