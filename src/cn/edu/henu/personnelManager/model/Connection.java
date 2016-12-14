package cn.edu.henu.personnelManager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tb_test_connection")
public class Connection {
	private int id;
	private String text;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
