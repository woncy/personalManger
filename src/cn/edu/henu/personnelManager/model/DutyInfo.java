package cn.edu.henu.personnelManager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	private Job job;
	private Record record;				//档案
	private Date accession_date;		//入职日期
	private Date dimission_date;		//离职日期
	private String dimission_reason;	//离职原因
	private String duty_type;			//用工形式
	private String duty_age;			//工龄
	private String annuity_safety_NO;	//养老金
	private Date first_pack_date;     //签署合同日期
	private Date pact_start_date;		//培训开始日期
	private Date pact_end_date;			//培训结束日期
	private String bank_name;			//发卡银行
	private String bank_NO;				//银行账号
	private String society_safety_NO;	//社会保险
	private String dole_safety_NO;		//失业保险
	private String mediocate_safety_NO; //医疗保险
	private String comopo_safety_No;	//工商保险
	private String accumulation_fund_NO;//公积金号
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
	@OneToOne
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
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
	public Date getFirst_pack_date() {
		return first_pack_date;
	}
	public void setFirst_pack_date(Date first_pack_date) {
		this.first_pack_date = first_pack_date;
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
	@Column(length=30)
	public String getDuty_type() {
		return duty_type;
	}
	public void setDuty_type(String duty_type) {
		this.duty_type = duty_type;
	}
	@Column(columnDefinition="char(6)")
	public String getDuty_age() {
		return duty_age;
	}
	
	public void setDuty_age(String duty_age) {
		this.duty_age = duty_age;
	}
	@Column(length=30)
	public String getAnnuity_safety_NO() {
		return annuity_safety_NO;
	}
	public void setAnnuity_safety_NO(String annuity_safety_NO) {
		this.annuity_safety_NO = annuity_safety_NO;
	}
	
	
	
}
