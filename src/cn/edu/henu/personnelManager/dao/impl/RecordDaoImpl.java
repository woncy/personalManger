package cn.edu.henu.personnelManager.dao.impl;

import java.util.List;


import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.RecordDao;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.Record;
@Component("recordDao")
public class RecordDaoImpl extends SuperDao implements RecordDao {
	
	@Override
	public List<Record> getALLRecords() {
		HibernateTemplate ht = this.getHibernateTemplate();
		String hql = "from cn.edu.henu.personnelManager.model.Record";
		@SuppressWarnings("unchecked")
		List<Record> records = ht.find(hql);
		return records;
	}

	@Override
	public boolean addRecord(Record record) {
		try{
			this.getHibernateTemplate().save(record);
		}catch(Exception e){
	e.printStackTrace();
			return false;
		}
		return true;
	}
	@Override
	public boolean deleteRecord(Record record){
		try{
			this.getHibernateTemplate().delete(record);
		}catch(Exception e){

			return false;
		}
		return true;
		
	}

	@Override
	public boolean updateRecord(Record record) {
		try{
			this.getHibernateTemplate().saveOrUpdate(record);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public Record getRecordbyId(int id) {
		Record record = this.getHibernateTemplate()
				.get(Record.class, id);
		return record;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Record getRecordByRecordNum(String num) {
		HibernateTemplate ht = this.getHibernateTemplate();
		String hql = "from cn.edu.henu.personnelManager.model.Record as r where r.record_number = '" + num +"'";
		List<Record> records = null;
		try{
			records = ht.find(hql);
		}catch(Exception e){
			return null;
		}
		if(records.size()>0){
			return records.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Record> getRecordsByHql(String hql) {
		HibernateTemplate ht = this.getHibernateTemplate();
		List<Record> records;
		try{
			records = ht.find(hql);
		}catch(Exception e){
			return null;
		}
		return records;
	}

	
}
