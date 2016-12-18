package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Record;
import cn.edu.henu.personnelManager.model.TimeCard;

public interface TimeCardService {
	public boolean addTimecard(TimeCard card);
	public TimeCard getTimecard(int id);
	public boolean deleteTimecard(TimeCard card);
	public boolean deleteTimecard(int card);
	public boolean updateTimecard(TimeCard card);
	public List<TimeCard> getCardByRecord(Record record);
}
