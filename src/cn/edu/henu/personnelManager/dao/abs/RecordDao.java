package cn.edu.henu.personnelManager.dao.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Record;

public interface RecordDao {
	public List<Record> getALLRecords();
	public boolean addRecord(Record record);
	public boolean updateRecord(Record record);
	public Record getRecordbyId(int id);
	public Record getRecordByRecordNum(String num);
	public List<Record> getRecordsByHql(String hql);
	public boolean deleteRecord(Record record);
}
