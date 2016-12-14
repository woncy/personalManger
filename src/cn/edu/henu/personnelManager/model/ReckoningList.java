package cn.edu.henu.personnelManager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity(name="tb_reckoning_list")
public class ReckoningList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Record record;
	private Reckoning reckoning;
	
	
	@Id
	@Column(name="record_id")
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
	@ManyToOne
	public Reckoning getReckoning() {
		return reckoning;
	}
	public void setReckoning(Reckoning reckoning) {
		this.reckoning = reckoning;
	}
	
	
	

}
