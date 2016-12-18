package cn.edu.henu.personnelManager.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.dao.abs.TimecardDao;
import cn.edu.henu.personnelManager.model.Record;
import cn.edu.henu.personnelManager.model.TimeCard;

@Component("timecardDao")
public class TimeCarDaoImpl extends SuperDao implements TimecardDao {

	@Override
	public boolean addTimecard(TimeCard card) {
		try{
			this.getHibernateTemplate().save(card);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public TimeCard getTimecard(int id) {
		TimeCard card;
		try{
			card = this.getHibernateTemplate().get(TimeCard.class, id);
			
		}catch(Exception e){
			return null;
		}
		return card;
	}

	@Override
	public boolean deleteTimecard(TimeCard card) {
		try{
			this.getHibernateTemplate().delete(card);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteTimecard(int id) {
		try{
			TimeCard card = this.getTimecard(id);
			this.deleteTimecard(card);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean updateTimecard(TimeCard card) {
		try{
			this.getHibernateTemplate().update(card);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TimeCard> getCardByRecord(Record record) {
		List<TimeCard> cards ;
		try{
			String hql = "from cn.edu.henu.personnelManager.model.TimeCard as card "
					+ "where card.record=:record";
			cards = this.getHibernateTemplate().findByNamedParam(hql, "record", record);
			
		}catch(Exception e){
			return null;
		}
		return cards;
	}

}
