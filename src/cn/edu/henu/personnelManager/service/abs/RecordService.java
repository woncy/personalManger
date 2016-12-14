package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.DutyInfo;
import cn.edu.henu.personnelManager.model.PersonalInfo;
import cn.edu.henu.personnelManager.model.Record;

public interface RecordService {
	public List<Record> getALLRecords();
	public boolean addRecord(Record record);
	public boolean updateRecord(Record record);
	public Record getRecordbyId(int id);
	public Record getRecordByRecordNum(String num);
	public List<Record> getRecordsByHql(String hql);
	public boolean deleteRecord(Record record);
	public boolean addRecord(Record record,PersonalInfo personalInfo,DutyInfo duty);

}
