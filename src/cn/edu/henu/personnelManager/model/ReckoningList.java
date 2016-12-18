package cn.edu.henu.personnelManager.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToOne
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
