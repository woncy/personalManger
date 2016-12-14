package cn.edu.henu.personnelManager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.format.annotation.DateTimeFormat;
@Entity(name="tb_duty_info")
public class DutyInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Department dept;
	private Record record;
	private Date accession_date;
	private Date dimission_date;
	private String dimission_reason;
	private Date first_pact_date;
	private Date pact_start_date;
	private Date pact_end_date;
	private String bank_name;
	private String bank_NO;
	private String society_safety_NO;
	private String dole_safety_NO;
	private String mediocate_safety_NO;
	private String comopo_safety_No;
	private String accumulation_fund_NO;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToOne
	@PrimaryKeyJoinColumn
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getAccession_date() {
		return accession_date;
	}
	public void setAccession_date(Date accession_date) {
		this.accession_date = accession_date;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getDimission_date() {
		return dimission_date;
	}
	public void setDimission_date(Date dimission_date) {
		this.dimission_date = dimission_date;
	}
	@Column(length=100,nullable=false)
	public String getDimission_reason() {
		return dimission_reason;
	}
	public void setDimission_reason(String dimission_reason) {
		this.dimission_reason = dimission_reason;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getFirst_pact_date() {
		return first_pact_date;
	}
	public void setFirst_pact_date(Date first_pact_date) {
		this.first_pact_date = first_pact_date;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getPact_start_date() {
		return pact_start_date;
	}
	public void setPact_start_date(Date pact_start_date) {
		this.pact_start_date = pact_start_date;
	}
	@Column(nullable=false)
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getPact_end_date() {
		return pact_end_date;
	}
	public void setPact_end_date(Date pact_end_date) {
		this.pact_end_date = pact_end_date;
	}
	@Column(length=60)
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	@Column(length=30,nullable=false)
	public String getBank_NO() {
		return bank_NO;
	}
	public void setBank_NO(String bank_NO) {
		this.bank_NO = bank_NO;
	}
	@Column(length=30)
	public String getSociety_safety_NO() {
		return society_safety_NO;
	}
	public void setSociety_safety_NO(String society_safety_NO) {
		this.society_safety_NO = society_safety_NO;
	}
	@Column(length=30)
	public String getDole_safety_NO() {
		return dole_safety_NO;
	}
	public void setDole_safety_NO(String dole_safety_NO) {
		this.dole_safety_NO = dole_safety_NO;
	}
	@Column(length=30)
	public String getMediocate_safety_NO() {
		return mediocate_safety_NO;
	}
	public void setMediocate_safety_NO(String mediocate_safety_NO) {
		this.mediocate_safety_NO = mediocate_safety_NO;
	}
	@Column(length=30)
	public String getComopo_safety_No() {
		return comopo_safety_No;
	}
	public void setComopo_safety_No(String comopo_safety_No) {
		this.comopo_safety_No = comopo_safety_No;
	}
	@Column(length=30)
	public String getAccumulation_fund_NO() {
		return accumulation_fund_NO;
	}
	public void setAccumulation_fund_NO(String accumulation_fund_NO) {
		this.accumulation_fund_NO = accumulation_fund_NO;
	}
	
	
}
