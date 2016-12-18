package cn.edu.henu.personnelManager.struts.formbean;

import org.apache.struts.action.ActionForm;

public class TimecardForm extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String departmentId;
	private String recordId;
	private String accountId;
	private String explain;
	private String start_date;
	private String end_date;
	private String ratifierId;
	private String ratifierDate;
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getRatifierId() {
		return ratifierId;
	}
	public void setRatifierId(String ratifierId) {
		this.ratifierId = ratifierId;
	}
	public String getRatifierDate() {
		return ratifierDate;
	}
	public void setRatifierDate(String ratifierDate) {
		this.ratifierDate = ratifierDate;
	}
	
	
	

}
