package cn.edu.henu.personnelManager.struts.formbean;

import org.apache.struts.action.ActionForm;

import cn.edu.henu.personnelManager.model.DutyInfo;
import cn.edu.henu.personnelManager.model.PersonalInfo;
import cn.edu.henu.personnelManager.model.Record;

public class RecordForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Record record = new Record();
	PersonalInfo personalInfo = new PersonalInfo();
	DutyInfo duty = new DutyInfo();
	private String birthDay;
	private String accession_date; //入职日期
	private String dimission_date; //离职日期
	private String pact_start_date;//合同开始日期
	private String pact_end_date;//合同结束日期
	private String first_pact_date;//签合同日期
	private String party_member_date;//入党日期
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public DutyInfo getDuty() {
		return duty;
	}
	public void setDuty(DutyInfo duty) {
		this.duty = duty;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getAccession_date() {
		return accession_date;
	}
	public void setAccession_date(String accession_date) {
		this.accession_date = accession_date;
	}
	public String getDimission_date() {
		return dimission_date;
	}
	public void setDimission_date(String dimission_date) {
		this.dimission_date = dimission_date;
	}
	public String getPact_start_date() {
		return pact_start_date;
	}
	public void setPact_start_date(String pact_start_date) {
		this.pact_start_date = pact_start_date;
	}
	public String getPact_end_date() {
		return pact_end_date;
	}
	public void setPact_end_date(String pact_end_date) {
		this.pact_end_date = pact_end_date;
	}
	public String getFirst_pact_date() {
		return first_pact_date;
	}
	public void setFirst_pact_date(String first_pact_date) {
		this.first_pact_date = first_pact_date;
	}
	public String getParty_member_date() {
		return party_member_date;
	}
	public void setParty_member_date(String party_member_date) {
		this.party_member_date = party_member_date;
	}
	
	
	
	
}
