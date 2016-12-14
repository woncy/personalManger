package cn.edu.henu.personnelManager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity(name="tb_bring_up_ontent")
public class BringUpOntent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private BringUpContent bring_up_content;
	private Record record;
	private int score;
	private String up_to_grade;
	private String remark;
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
	public BringUpContent getBring_up_content() {
		return bring_up_content;
	}
	public void setBring_up_content(BringUpContent bring_up_content) {
		this.bring_up_content = bring_up_content;
	}
	@ManyToOne
	@JoinColumn(nullable=false)
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	@Column(nullable=false)
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Column(nullable=false,columnDefinition="char(2)")
	public String getUp_to_grade() {
		return up_to_grade;
	}
	public void setUp_to_grade(String up_to_grade) {
		this.up_to_grade = up_to_grade;
	}
	@Column(length=60,nullable=false)
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
