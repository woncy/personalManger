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
@Entity(name="tb_rewards_and_punishment")
public class RewardsAndPunishment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Record record;
	private String type;
	private String reason;
	private String content;
	private int money;
	private Date start_date;
	private Date end_date;
	private Record ratifier_record;
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
	@Column(nullable=false,columnDefinition="char(4)")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(length=60,nullable=false)
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Column(length=100,nullable=false)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@DateTimeFormat(pattern="yyyy-DD-MM")
	@Column(nullable=false)
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	@DateTimeFormat(pattern="yyyy-DD-MM")
	@Column(nullable=false)
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@ManyToOne
	@JoinColumn(nullable=false)
	public Record getRatifier_record() {
		return ratifier_record;
	}
	public void setRatifier_record(Record ratifier_record) {
		this.ratifier_record = ratifier_record;
	}
	@DateTimeFormat(pattern="yyyy-DD-MM")
	@Column(nullable=false)
	public Date getRatifier_date() {
		return ratifier_date;
	}
	public void setRatifier_date(Date ratifier_date) {
		this.ratifier_date = ratifier_date;
	}
	
	
	
	
}
