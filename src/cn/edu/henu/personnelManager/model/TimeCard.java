package cn.edu.henu.personnelManager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
@Entity(name="tb_timecard")
public class TimeCard implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Record record;
	private AccountItem accountItem;
	private String explain;
	private Date start_date;
	private Date end_date;
	private Record retifierRecord;
	private Date ratifier_date;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(nullable=false)
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	@ManyToOne
	@JoinColumn(nullable=false)
	public AccountItem getAccountItem() {
		return accountItem;
	}
	public void setAccountItem(AccountItem accountItem) {
		this.accountItem = accountItem;
	}
	@Column(length=100,nullable=false)
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@ManyToOne
	@JoinColumn(nullable=false)
	public Record getRetifierRecord() {
		return retifierRecord;
	}
	public void setRetifierRecord(Record retifierRecord) {
		this.retifierRecord = retifierRecord;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getRatifier_date() {
		return ratifier_date;
	}
	public void setRatifier_date(Date ratifier_date) {
		this.ratifier_date = ratifier_date;
	}
	

}
