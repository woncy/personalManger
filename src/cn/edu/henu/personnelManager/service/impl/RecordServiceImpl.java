package cn.edu.henu.personnelManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.DutyInfoDao;
import cn.edu.henu.personnelManager.dao.abs.PersonalInfoDao;
import cn.edu.henu.personnelManager.dao.abs.RecordDao;
import cn.edu.henu.personnelManager.model.DutyInfo;
import cn.edu.henu.personnelManager.model.PersonalInfo;
import cn.edu.henu.personnelManager.model.Record;
import cn.edu.henu.personnelManager.service.abs.RecordService;
@Component("recordService")
public class RecordServiceImpl implements RecordService{

	private RecordDao recordDao;
	private PersonalInfoDao personalInfoDao;
	private DutyInfoDao dutyInfoDao;
	public RecordDao getRecordDao() {
		return recordDao;
	}
	@Resource(name="recordDao")
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}
	
	public PersonalInfoDao getPersonalInfoDao() {
		return personalInfoDao;
	}
	@Resource(name="personalInfoDao")
	public void setPersonalInfoDao(PersonalInfoDao personalInfoDao) {
		this.personalInfoDao = personalInfoDao;
	}
	
	public DutyInfoDao getDutyInfoDao() {
		return dutyInfoDao;
	}
	@Resource(name="dutyInfoDao")
	public void setDutyInfoDao(DutyInfoDao dutyInfoDao) {
		this.dutyInfoDao = dutyInfoDao;
	}
	@Override
	public List<Record> getALLRecords() {
		return recordDao.getALLRecords();
	}
	@Override
	public boolean addRecord(Record record) {
		return recordDao.addRecord(record);
	}
	@Override
	public boolean updateRecord(Record record) {
		return recordDao.updateRecord(record);
	}
	@Override
	public Record getRecordbyId(int id) {
		return recordDao.getRecordbyId(id);
	}
	@Override
	public Record getRecordByRecordNum(String num) {

		return recordDao.getRecordByRecordNum(num);
	}
	@Override
	public List<Record> getRecordsByHql(String hql) {
		return getRecordsByHql(hql);
	}
	@Override
	public boolean deleteRecord(Record record) {
		return recordDao.deleteRecord(record);
	}
	@Override
	public boolean addRecord(Record record, PersonalInfo personalInfo,
			DutyInfo duty) {
		
		boolean b1 = recordDao.addRecord(record);
		System.out.println("b1="+b1);
		boolean b2 = false;
		boolean b3 = false;
		if(b1){
		
			personalInfo.setId(record.getId());
			b2 = personalInfoDao.addPersonalInfo(personalInfo);
			System.out.println("b2="+b2);
			
			if(b2){
				duty.setId(record.getId());
				b3 = dutyInfoDao.addDutyInfo(duty);
				System.out.println("b3="+b3);
				if(b3)
					return true;
				else {
					personalInfoDao.deletePersonnalInfoById(personalInfo.getId());
					this.deleteRecord(this.getRecordbyId(record.getId()));
					return false;
				}
			}else{
				this.deleteRecord(this.getRecordbyId(record.getId()));
				return false;
			}
		}
		
		return false;
		
	}
	

}

